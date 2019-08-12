package name.anton3.executors.util

import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import name.anton3.executors.core.DynamicRequest
import name.anton3.executors.core.IsIncompleteBatch
import name.anton3.executors.core.RequestStorage
import name.anton3.executors.core.setStorage
import java.util.*
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ConcurrentLinkedQueue
import java.util.concurrent.atomic.AtomicLong
import kotlin.Comparator

/**
 * A simple and fast FIFO-queue request storage. O(1) per add/poll.
 */
class FifoRequestStorage<Request> : RequestStorage<Request> {

    override suspend fun add(request: DynamicRequest<Request>) {
        request.setStorage(this)
        set.add(request)
        queue.add(request)
    }

    override suspend fun poll(): DynamicRequest<Request> {
        val request = queue.poll()!!
        set.remove(request)
        return request.apply { setStorage(null) }
    }

    override suspend fun pollMany(n: Int): List<DynamicRequest<Request>> {
        return List(n) { poll() }
    }

    override suspend fun update(request: DynamicRequest<Request>, updater: suspend () -> Unit) {
        updater()
    }

    override suspend fun contains(request: DynamicRequest<Request>): Boolean {
        return request in set
    }

    private val queue: Queue<DynamicRequest<Request>> = ConcurrentLinkedQueue()
    private val set: MutableSet<DynamicRequest<Request>> =
        ConcurrentHashMap<DynamicRequest<Request>, Unit>().keySet(Unit)
}

class SortedRequestStorage<Request, State>(
    private val stateBuilder: (DynamicRequest<Request>) -> State,
    priorityComparator: java.util.Comparator<Pair<DynamicRequest<Request>, State>>
) : RequestStorage<Request> {

    override suspend fun add(request: DynamicRequest<Request>) {
        request.setStorage(this)
        val state = stateBuilder(request)
        mutex.withLock {
            states[request] = state
            requests.add(request)
        }
    }

    override suspend fun poll(): DynamicRequest<Request> {
        return mutex.withLock { pollInternal() }
    }

    override suspend fun pollMany(n: Int): List<DynamicRequest<Request>> {
        return mutex.withLock { List(n) { pollInternal() } }
    }

    override suspend fun update(request: DynamicRequest<Request>, updater: suspend () -> Unit) {
        return mutex.withLock {
            val containsRequest = requests.remove(request)
            updater()
            if (containsRequest) requests.add(request)
        }
    }

    override suspend fun contains(request: DynamicRequest<Request>): Boolean {
        return mutex.withLock { requests.contains(request) }
    }

    private suspend inline fun pollInternal(): DynamicRequest<Request> {
        val result = requests.pollLast()!!
        states.remove(result)
        return result.apply { setStorage(null) }
    }

    private val requests: NavigableSet<DynamicRequest<Request>>
    private val states: MutableMap<DynamicRequest<Request>, State> = HashMap()
    private val mutex: Mutex = Mutex()

    init {
        val comparator = Comparator<DynamicRequest<Request>> { r1, r2 ->
            val s1 = states[r1] ?: return@Comparator 1
            val s2 = states[r2] ?: return@Comparator -1
            priorityComparator.compare(r1 to s1, r2 to s2)
        }

        requests = TreeSet(comparator)
    }
}

fun <Request> batchAwareRequestStorage(): RequestStorage<Request> {
    val orderGenerator = AtomicLong(0)

    return SortedRequestStorage(
        stateBuilder = {
            orderGenerator.getAndIncrement()
        },
        priorityComparator = compareBy<Pair<DynamicRequest<Request>, Long>> {
            it.first[IsIncompleteBatch] != true
        }.thenByDescending {
            it.second
        }
    )
}
