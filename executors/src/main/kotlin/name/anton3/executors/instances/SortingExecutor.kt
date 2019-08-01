package name.anton3.executors.instances

import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import name.anton3.executors.core.DynamicExecutor
import name.anton3.executors.core.DynamicRequest
import name.anton3.executors.core.RequestStorage
import name.anton3.executors.core.SynchronizedDynamicRequest
import name.anton3.executors.util.CompletableRequest
import java.io.Closeable
import kotlin.coroutines.CoroutineContext

class SortingExecutor<Request, Response>(
    private val base: DynamicExecutor<Request, Response>,
    parentContext: CoroutineContext,
    override val requestStorage: RequestStorage<Request>
) : StoringDynamicExecutor<Request, Response>(), Closeable {

    override val job: Job = SupervisorJob(parent = parentContext[Job])

    override suspend fun execute(dynamicRequest: DynamicRequest<Request>): Response = submit(dynamicRequest) {
        val baseRequest = IntermediateRequest()

        try {
            val response = base.execute(baseRequest)
            baseRequest.innerCompletableRequest?.complete(response)
        } catch (e: Throwable) {
            baseRequest.innerCompletableRequest?.completeExceptionally(e)
        }
    }

    override fun close() {
        job.cancel()
    }

    private inner class IntermediateRequest : SynchronizedDynamicRequest<Request>() {
        var innerCompletableRequest: CompletableRequest<Request, Response>? = null

        override suspend fun finalize(): Request =
            poll().also { innerCompletableRequest = it }.request.get()

        override fun <T : Any> get(key: DynamicRequest.Key<T>): T? = null
    }
}
