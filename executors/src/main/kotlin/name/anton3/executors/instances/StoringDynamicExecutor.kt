package name.anton3.executors.instances

import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.Job
import name.anton3.executors.core.DynamicExecutor
import name.anton3.executors.core.DynamicRequest
import name.anton3.executors.core.RequestStorage
import name.anton3.executors.util.CompletableRequest

abstract class StoringDynamicExecutor<Request, Response> : DynamicExecutor<Request, Response> {

    protected abstract val requestStorage: RequestStorage<Request>
    protected abstract val job: Job

    protected suspend fun add(request: DynamicRequest<Request>): CompletableDeferred<Response> {
        val handle = CompletableDeferred<Response>(parent = job)
        val withHandle: DynamicRequest<Request> = CompletableRequestAsDynamic(CompletableRequest(request, handle))
        requestStorage.add(withHandle)
        return handle
    }

    protected suspend inline fun submit(request: DynamicRequest<Request>, block: () -> Unit): Response {
        val handle = add(request)
        block()
        return handle.await()
    }

    protected suspend fun poll(): CompletableRequest<Request, Response> {
        val request = requestStorage.poll()
        @Suppress("UNCHECKED_CAST")
        return request[CompletableRequestKey] as CompletableRequest<Request, Response>
    }

    protected suspend fun pollMany(n: Int): List<CompletableRequest<Request, Response>> {
        val requests = requestStorage.pollMany(n)
        @Suppress("UNCHECKED_CAST")
        return requests.map { it[CompletableRequestKey] as CompletableRequest<Request, Response> }
    }

    private object CompletableRequestKey : DynamicRequest.Key<CompletableRequest<*, *>>

    private class CompletableRequestAsDynamic<Request, Response>(
        private val completableRequest: CompletableRequest<Request, Response>
    ) : DynamicRequest<Request> {

        override suspend fun get(): Request = completableRequest.request.get()

        override fun <T : Any> get(key: DynamicRequest.Key<T>): T? {
            return if (key is CompletableRequestKey) {
                @Suppress("UNCHECKED_CAST")
                completableRequest as T
            } else {
                completableRequest.request[key]
            }
        }
    }
}
