package name.anton3.executors.instances

import kotlinx.coroutines.*
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.Semaphore
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.time.delay
import name.anton3.executors.core.DynamicExecutor
import name.anton3.executors.core.DynamicRequest
import name.anton3.executors.core.RequestStorage
import name.anton3.executors.core.TypedRequestStorage
import name.anton3.executors.util.CompletableRequest
import name.anton3.executors.util.FifoRequestStorage
import name.anton3.executors.util.complete
import name.anton3.executors.util.submit
import java.io.Closeable
import java.time.Duration
import java.util.*
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ConcurrentMap
import java.util.concurrent.ConcurrentSkipListSet
import kotlin.coroutines.CoroutineContext

/**
 * An executor that sends its requests in one of several [directions].
 * The pool of directions can be fetched or modified at any time.
 * All available methods can be called concurrently.
 * The executor must be [closed][close] when it is no longer needed.
 *
 * @param base An executor-like lambda that takes an additional [Direction] parameter
 * @param context The parent context for the context of this executor
 * @param requestStorage An optional [RequestStorage] that defines priority for requests
 */
class DistributingExecutor<Request, Response, Direction>(
    private val base: suspend (DynamicRequest<Request>, Direction) -> Response,
    context: CoroutineContext,
    requestStorage: RequestStorage<Request> = FifoRequestStorage()
) : DynamicExecutor<Request, Response>, Closeable {

    private val requestStorage = TypedRequestStorage<Request, CompletableRequest<Request, Response>>(requestStorage)
    private val context: CoroutineContext = context + SupervisorJob(parent = context[Job])
    private val coroutineScope: CoroutineScope = CoroutineScope(context)

    // A ticket is a right to execute a request according to the rate limit. There are:
    // - Global tickets, which belong to the cumulative rate limit of all directions
    // - Local tickets, which belong to rate limit of a specific direction (a.k.a. `TicketGroup`)
    //
    // To be able to send a request, one must acquire a global ticket and a local ticket.
    // Tickets are released after the request is executed + some delay, as specified by their ticket group.
    private val globalTickets: Semaphore = Semaphore(permits = Int.MAX_VALUE, acquiredPermits = Int.MAX_VALUE)

    // A `TicketGroup` manages tickets belonging to a specific direction
    // The class lacks any synchronization. Use `ticketMutex`
    private class TicketGroup<Direction>(
        val direction: Direction,
        rateLimit: Int,
        val ratePeriod: Duration
    ) : Comparable<TicketGroup<Direction>> {

        init {
            require(rateLimit >= 1)
            require(ratePeriod > Duration.ZERO)
        }

        private var ticketsAvailable: Int = rateLimit
        private var ticketsExist: Int = rateLimit
        var removalCompletion: CompletableJob? = null  // Create on demand to save memory

        fun acquire(): Boolean {
            if (ticketsAvailable == 0) return false
            ticketsAvailable -= 1
            return true
        }

        fun release() {
            check(ticketsAvailable < ticketsExist)
            ticketsAvailable += 1
        }

        // Signal that an acquired ticket won't be returned
        // Returns how many tickets exist now
        fun destroyAcquiredTicket(): Int {
            check(ticketsExist != 0) { "All tickets have already been destroyed" }
            check(ticketsExist > ticketsAvailable) { "The ticket needs to be acquired first" }
            ticketsExist -= 1
            return ticketsExist
        }

        // `TicketGroup`s are ordered by `ticketsAvailable`
        // Of all `TicketGroup`s, one has greater changes to `acquire` from a "greater" `TicketGroup`
        // When `acquire`-ing or `release`-ing, remember to reinsert the `TicketGroup` into maps
        override fun compareTo(other: TicketGroup<Direction>): Int {
            val compareTickets = ticketsAvailable.compareTo(other.ticketsAvailable)
            if (compareTickets != 0) return compareTickets
            return System.identityHashCode(this).compareTo(System.identityHashCode(other))
        }
    }

    // To support removal of directions
    private val directionStorage: ConcurrentMap<Direction, TicketGroup<Direction>> = ConcurrentHashMap()

    private val ticketGroups: NavigableSet<TicketGroup<Direction>> = ConcurrentSkipListSet()
    private val ticketGroupsRemoval: NavigableSet<TicketGroup<Direction>> = TreeSet()
    private val ticketMutex: Mutex = Mutex()

    /**
     * The collection of directions that belong to this executor.
     * A direction belongs to this executor if it was previously added using [addDirection] and has not been removed
     * since then (using [removeDirection] or [removeDirectionAndJoin]).
     *
     * @see addDirection
     * @see removeDirection
     * @see removeDirectionAndJoin
     */
    val directions: Set<Direction>
        get() = directionStorage.keys

    /**
     * Add [direction] to this executor with the specified rate parameters.
     * If [direction] already belongs to this executor, does nothing.
     *
     * @return `true` if [direction] has been added successfully
     * @see directions
     */
    fun addDirection(direction: Direction, rateLimit: Int, ratePeriod: Duration): Boolean {
        if (direction in directionStorage) return false
        val group = TicketGroup(direction, rateLimit, ratePeriod)
        if (directionStorage.putIfAbsent(direction, group) != null) return false

        // (*) If we got here, another thread won't add the same direction
        ticketGroups.add(group)
        repeat(rateLimit) { globalTickets.release() }
        return true
    }

    /**
     * Remove [direction] from this executor if it belongs to this executor.
     * Unlike [removeDirectionAndJoin], this method returns immediately.
     *
     * @param direction the direction to remove
     * @return `true` if [direction] has been removed successfully
     * @see directions
     * @see removeDirectionAndJoin
     */
    fun removeDirection(direction: Direction): Boolean {
        return removeDirectionInternal(direction) != null
    }

    /**
     * Remove [direction] from this executor if it belongs to this executor.
     * Unlike [removeDirection], this method waits for all the requests previously sent to [direction] to complete.
     *
     * @param direction the direction to remove
     * @return `true` if [direction] has been removed successfully
     * @see directions
     * @see removeDirection
     */
    suspend fun removeDirectionAndJoin(direction: Direction): Boolean {
        return removeDirectionInternal(direction)?.join() != null
    }

    /**
     * Execute [dynamicRequest] by passing it to [base] along with some free [Direction] from [directions].
     * If all [directions] are fully loaded according to their rate limits, wait until one becomes available.
     * If multiple [directions] are available, pick the one which has the most rate tickets available.
     * If [directions] is empty, wait until some are added.
     *
     * @param dynamicRequest the request
     * @return the response
     * @throws CancellationException if the executor has been [closed][close]
     * @see directions
     */
    override suspend fun execute(dynamicRequest: DynamicRequest<Request>): Response = submit(context) { handle ->
        requestStorage.add(CompletableRequest(dynamicRequest, handle))
        coroutineScope.launch { executeStoredRequest() }
    }

    /**
     * [Cancel][CoroutineContext.cancel] the [CoroutineContext] of this executor.
     * All pending and future requests of a closed executor will fail with [CancellationException].
     *
     * @see execute
     */
    override fun close() {
        context.cancel()
    }


    private fun removeDirectionInternal(direction: Direction): Job? {
        val group = directionStorage.remove(direction) ?: return null

        // (*) If we got here, another thread won't remove the same direction
        val completion = Job(parent = context[Job])
        group.removalCompletion = completion
        coroutineScope.launch { removeTicketGroup(group) }
        return completion
    }

    private suspend inline fun removeTicketGroup(group: TicketGroup<Direction>) {
        // Move `group` from `ticketGroups` to `ticketGroupsRemoval`
        doWhile {
            ticketMutex.withLock {
                if (!ticketGroups.remove(group)) {
                    // `addDirection` is currently executing with `group` at (*), we need to wait
                    yield()
                    return@doWhile true
                }
                ticketGroupsRemoval.add(group)
            }
            false
        }

        // Destroy all free local tickets of `group`, one after another
        // The tickets are normally destroyed by successive `execute` calls, except when there are none of them
        doWhile {
            globalTickets.acquire()
            var destroyGlobalTicket = false

            try {
                val consumedAllFreeTickets = ticketMutex.withLock {
                    val ticketsLeft = tryDestroyLocalTicketWithGlobalTicket(group)
                    if (ticketsLeft != null) destroyGlobalTicket = true
                    ticketsLeft ?: 0 == 0
                }
                !consumedAllFreeTickets
            } finally {
                if (!destroyGlobalTicket) globalTickets.release()
            }
        }
    }

    private suspend inline fun executeStoredRequest() {
        doWhile {
            globalTickets.acquire()
            var destroyGlobalTicket = false

            try {
                val group = ticketMutex.withLock {
                    // First check if the global ticket needs to be spent on the cleanup work,
                    // in order to destroy a local ticket of a `TicketGroup` that is being removed
                    val removal = ticketGroupsRemoval.lastOrNull()
                    if (removal != null) {
                        if (tryDestroyLocalTicketWithGlobalTicket(removal) != null) {
                            destroyGlobalTicket = true
                            return@doWhile true
                        }
                    }

                    // If we got here, there are no free local tickets of removed `TicketGroup`s and
                    // no corresponding global tickets lying around. There must be free valid local tickets
                    val group = ticketGroups.pollLast() ?: error("No ticket groups, but acquired a ticket")
                    check(group.acquire()) { "Global ticket is available, but not a local one" }
                    ticketGroups.add(group)
                    group
                }

                try {
                    // OK, a global ticket and a local ticket have been acquired
                    // There will be a request, because `executeStoredRequest` is called once per request
                    val request = requestStorage.poll()
                    request.handle.complete(runCatching { base(request.request, group.direction) })
                    delay(group.ratePeriod)
                } finally {
                    // Release the local ticket once the request is completed. If the `RequestGroup` is being removed,
                    // the local ticket will be destroyed by a successive `execute`
                    ticketMutex.withLock(onCancelled = { group.release() }) {
                        val groupActive = ticketGroups.remove(group)
                        val groupInRemoval = ticketGroupsRemoval.remove(group)
                        group.release()
                        if (groupActive) ticketGroups.add(group)
                        if (groupInRemoval) ticketGroupsRemoval.add(group)
                    }
                }
            } finally {
                if (!destroyGlobalTicket) globalTickets.release()
            }

            false
        }
    }

    // Acquire and destroy a local ticket, along with a provided (already acquired) global ticket
    // The global ticket is consumed unless the function returns `null`
    // Requires `ticketMutex` ownership
    // Returns How many tickets exist now, or null if no local tickets are available
    private fun tryDestroyLocalTicketWithGlobalTicket(
        group: TicketGroup<Direction>,
        localTicketAlreadyAcquired: Boolean = false
    ): Int? {
        if (!localTicketAlreadyAcquired) {
            if (!ticketGroupsRemoval.remove(group)) return null
            val noTicketsAvailable = !group.acquire()
            ticketGroupsRemoval.add(group)

            if (noTicketsAvailable) return null
        }

        val ticketsExist = group.destroyAcquiredTicket()
        if (ticketsExist == 0) {
            ticketGroupsRemoval.remove(group)
            group.removalCompletion!!.complete()
        }

        return ticketsExist
    }
}

// Like a normal do-while loop, but allows to "break" from nested lambdas
private inline fun doWhile(block: () -> Boolean) {
    @Suppress("ControlFlowWithEmptyBody")
    while (block());
}

// Like normal `withLock`, but executes `onCancelled` if a `CancellationException` is thrown from `lock`
private suspend inline fun <T> Mutex.withLock(onCancelled: () -> Unit, owner: Any? = null, action: () -> T): T {
    try {
        lock(owner)
    } catch (e: Throwable) {
        onCancelled()
        throw e
    }

    try {
        return action()
    } finally {
        unlock(owner)
    }
}
