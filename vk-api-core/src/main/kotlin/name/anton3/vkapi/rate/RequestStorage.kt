package name.anton3.vkapi.rate

import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import java.util.*
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ConcurrentLinkedQueue
import java.util.concurrent.atomic.AtomicLong

/**
 * A temporary storage for incoming requests.
 * Requests can be reordered internally, following some criteria, so retrieval order can differ from addition order.
 * All the methods may be called concurrently.
 * Requests stored in a `RequestStorage` should only be modified using `DynamicRequest.modify`.
 */
interface RequestStorage<Request> {

    suspend fun add(request: DynamicRequest<Request>)

    /**
     * It's Undefined Behavior to poll from an empty RequestStorage
     */
    suspend fun poll(): DynamicRequest<Request>

    suspend fun pollMany(n: Int): List<DynamicRequest<Request>> = List(n) { poll() }

    /**
     * Call `updater`, which will modify `request`. Fix position of `request` in queue if needed.
     * If the request is not in this storage, just call `updater`.
     */
    suspend fun update(request: DynamicRequest<Request>, updater: suspend () -> Unit)

    suspend fun contains(request: DynamicRequest<Request>): Boolean
}


private class RequestStorageReference {
    var value: RequestStorage<*>? = null
    val mutex: ReadWriteMutex = ReadWriteMutex()

    internal suspend inline fun <Request, R> get(block: (RequestStorage<Request>?) -> R): R {
        @Suppress("UNCHECKED_CAST")
        return mutex.read.withLock { block(value as RequestStorage<Request>?) }
    }

    internal suspend inline fun <Request> set(block: () -> RequestStorage<Request>?) {
        mutex.write.withLock { value = block() }
    }
}

private val requestStorageReferences: MutableMap<DynamicRequest<*>, RequestStorageReference> =
    Collections.synchronizedMap(ConcurrentHashMap())

/**
 * Must be called in RequestStorage.add and RequestStorage.poll
 */
suspend fun <Request> DynamicRequest<Request>.setStorage(requestStorage: RequestStorage<Request>?) {
    requestStorageReferences.computeIfAbsent(this) { RequestStorageReference() }.set { requestStorage }
}

/**
 * All meta-info modifications must be made through this method
 * Calls RequestStorage.update
 */
suspend fun <Request> DynamicRequest<Request>.modify(block: suspend () -> Unit) {
    val storageRef = requestStorageReferences[this]

    if (storageRef == null) {
        block()
        return
    }

    val hasStorage = storageRef.get { storage: RequestStorage<Request>? ->
        storage?.update(this, block)
        storage != null
    }

    if (!hasStorage) block()
}


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
    private val set: MutableSet<DynamicRequest<Request>> = ConcurrentHashMap<DynamicRequest<Request>, Unit>().keySet(Unit)
}

class SortedRequestStorage<Request, State>(
    private val stateBuilder: (DynamicRequest<Request>) -> State,
    priorityComparator: Comparator<Pair<DynamicRequest<Request>, State>>
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

    @Suppress("NOTHING_TO_INLINE")
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
