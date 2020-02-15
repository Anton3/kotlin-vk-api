package name.anton3.executors.instances

import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.Job
import name.anton3.executors.core.DynamicExecutor
import name.anton3.executors.core.DynamicRequest
import name.anton3.executors.core.RequestStorage
import name.anton3.executors.util.CompletableRequest
import java.util.*

abstract class StoringDynamicExecutor<Request, Response> : DynamicExecutor<Request, Response> {

    protected abstract val requestStorage: RequestStorage<Request>
    protected abstract val job: Job

    private val handles: MutableMap<DynamicRequest<Request>, CompletableDeferred<Response>> =
        Collections.synchronizedMap(WeakHashMap())

    protected suspend fun add(request: DynamicRequest<Request>): CompletableDeferred<Response> {
        requestStorage.add(request)
        return CompletableDeferred<Response>(parent = job).also { handles[request] = it }
    }

    protected suspend inline fun submit(request: DynamicRequest<Request>, block: () -> Unit): Response {
        val handle = add(request)
        block()
        return handle.await()
    }

    protected suspend fun poll(): CompletableRequest<Request, Response> {
        val request = requestStorage.poll()
        return CompletableRequest(request, handles[request]!!)
    }

    protected suspend fun pollMany(n: Int): List<CompletableRequest<Request, Response>> {
        val requests = requestStorage.pollMany(n)
        return requests.map { CompletableRequest(it, handles[it]!!) }
    }
}
