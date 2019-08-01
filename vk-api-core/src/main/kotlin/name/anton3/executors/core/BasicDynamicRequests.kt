package name.anton3.executors.core

import kotlinx.coroutines.CompletableDeferred
import name.anton3.executors.util.complete
import java.util.concurrent.atomic.AtomicBoolean

data class SimpleDynamicRequest<Request>(private val request: Request) : DynamicRequest<Request> {
    override suspend fun get(): Request = request

    override fun <T : Any> get(key: DynamicRequest.Key<T>): T? = null
}

abstract class SynchronizedDynamicRequest<out Request> : DynamicRequest<Request> {
    final override suspend fun get(): Request {
        if (!internalRequestStarted.getAndSet(true)) {
            internalRequest.complete { finalize() }
        }
        return internalRequest.await()
    }

    protected abstract suspend fun finalize(): Request

    private val internalRequest: CompletableDeferred<Request> = CompletableDeferred()
    private val internalRequestStarted: AtomicBoolean = AtomicBoolean(false)
}

fun <Request, BaseRequest> DynamicRequest<BaseRequest>.map(
    block: suspend (BaseRequest) -> Request
): SynchronizedDynamicRequest<Request> = MappedDynamicRequest(this, block)


internal class MappedDynamicRequest<Request, BaseRequest>(
    private val base: DynamicRequest<BaseRequest>,
    private val preprocessor: suspend (BaseRequest) -> Request
) : SynchronizedDynamicRequest<Request>() {

    override suspend fun finalize(): Request = preprocessor(base.get())

    override fun <T : Any> get(key: DynamicRequest.Key<T>): T? = base[key]
}
