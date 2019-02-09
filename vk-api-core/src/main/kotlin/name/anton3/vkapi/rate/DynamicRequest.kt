package name.anton3.vkapi.rate

import kotlinx.coroutines.CompletableDeferred
import java.util.concurrent.atomic.AtomicBoolean

interface DynamicRequest<out Request> {
    suspend fun get(): Request
    val isIncompleteBatch: Boolean
    val canBeBatched: Boolean
}

data class SimpleDynamicRequest<Request>(
    val request: Request,
    override val isIncompleteBatch: Boolean = false,
    override val canBeBatched: Boolean = true
) : DynamicRequest<Request> {
    override suspend fun get(): Request = request
}

abstract class SynchronizedDynamicRequest<out Request> : DynamicRequest<Request> {
    override suspend fun get(): Request {
        if (!internalRequestStarted.getAndSet(true)) {
            internalRequest.complete { finalize() }
        }
        return internalRequest.await()
    }

    protected abstract suspend fun finalize(): Request

    private val internalRequest: CompletableDeferred<Request> = CompletableDeferred()
    private val internalRequestStarted: AtomicBoolean = AtomicBoolean(false)
}

class MappedDynamicRequest<Request, BaseRequest>(
    private val base: DynamicRequest<BaseRequest>,
    private val preprocessor: suspend (BaseRequest) -> Request
) : SynchronizedDynamicRequest<Request>() {

    override val isIncompleteBatch: Boolean get() = base.isIncompleteBatch
    override val canBeBatched: Boolean get() = base.canBeBatched

    override suspend fun finalize(): Request {
        return preprocessor(base.get())
    }
}

fun <Request, BaseRequest> DynamicRequest<BaseRequest>.map(
    block: suspend (BaseRequest) -> Request
): DynamicRequest<Request> = MappedDynamicRequest(this, block)
