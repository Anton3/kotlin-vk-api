package name.anton3.executors.instances

import kotlinx.coroutines.*
import name.anton3.executors.core.*
import name.anton3.executors.util.CompletableRequest
import name.anton3.executors.util.complete
import name.anton3.executors.util.submit
import java.io.Closeable
import kotlin.coroutines.CoroutineContext

class SortingExecutor<Request, Response>(
    private val base: DynamicExecutor<Request, Response>,
    parentContext: CoroutineContext,
    requestStorage: RequestStorage<Request>
) : DynamicExecutor<Request, Response>, Closeable {

    private val requestStorage = TypedRequestStorage<Request, CompletableRequest<Request, Response>>(requestStorage)
    private val context: CoroutineContext = parentContext + SupervisorJob(parent = parentContext[Job])
    private val coroutineScope = CoroutineScope(context)

    override suspend fun execute(dynamicRequest: DynamicRequest<Request>): Response = submit(context) { handle ->
        requestStorage.add(CompletableRequest(dynamicRequest, handle))

        coroutineScope.launch {
            val baseRequest = IntermediateRequest()
            val response = runCatching { base.execute(baseRequest) }
            baseRequest.innerCompletableRequest?.handle?.complete(response)
        }
    }

    override fun close() {
        context.cancel()
    }

    private inner class IntermediateRequest : SynchronizedDynamicRequest<Request>() {
        var innerCompletableRequest: CompletableRequest<Request, Response>? = null

        override suspend fun finalize(): Request {
            val inner = requestStorage.poll()
            innerCompletableRequest = inner
            return inner.request.get()
        }

        override fun <T : Any> get(key: DynamicRequest.Key<T>): T? = null
    }
}
