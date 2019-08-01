package name.anton3.executors.core

import kotlinx.coroutines.sync.withLock
import name.anton3.executors.util.ReadWriteMutex
import java.util.*
import java.util.concurrent.ConcurrentHashMap

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
