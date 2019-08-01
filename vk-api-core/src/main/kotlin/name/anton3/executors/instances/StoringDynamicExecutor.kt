package name.anton3.executors.instances

import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.Job
import name.anton3.executors.core.DynamicExecutor
import name.anton3.executors.core.DynamicRequest
import name.anton3.executors.core.RequestStorage
import name.anton3.executors.util.CompletableRequest
import java.util.concurrent.ConcurrentHashMap

abstract class StoringDynamicExecutor<Request, Response> : DynamicExecutor<Request, Response> {

    protected abstract val requestStorage: RequestStorage<Request>
    protected abstract val job: Job

    private val responseHandles: MutableMap<DynamicRequest<Request>, CompletableDeferred<Response>> = ConcurrentHashMap()

    protected suspend fun add(request: DynamicRequest<Request>): CompletableDeferred<Response> {
        val handle = CompletableDeferred<Response>(parent = job)
        responseHandles[request] = handle

        try {
            requestStorage.add(request)
        } catch (e: Throwable) {
            responseHandles.remove(request)
            throw e
        }

        return handle
    }

    protected suspend inline fun submit(request: DynamicRequest<Request>, block: () -> Unit): Response {
        val handle = add(request)
        block()
        return handle.await()
    }

    protected suspend fun poll(): CompletableRequest<Request, Response> {
        val request = requestStorage.poll()
        val handle = responseHandles.remove(request) ?: error("Fake request polled from RequestStorage")
        return CompletableRequest(request, handle)
    }

    protected suspend fun pollMany(n: Int): List<CompletableRequest<Request, Response>> {
        val requests = requestStorage.pollMany(n)
        return requests.map { request ->
            val handle = responseHandles.remove(request) ?: error("Fake request polled from RequestStorage")
            CompletableRequest(request, handle)
        }
    }
}
