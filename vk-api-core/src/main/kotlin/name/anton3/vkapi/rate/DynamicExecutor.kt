package name.anton3.vkapi.rate

import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import java.util.concurrent.atomic.AtomicReference

interface Executor<Request, Response> {
    suspend fun execute(request: Request): Response
}

abstract class DynamicRequest<Request> {

    suspend fun get(): Request {
        if (internalRequest.get() == null) {
            internalRequestMutex.withLock {
                if (internalRequest.get() == null) {
                    internalRequest.set(finalize())
                }
            }
        }
        return internalRequest.get()!!
    }

    abstract val isIncompleteBatch: Boolean

    protected abstract suspend fun finalize(): Request

    private val internalRequest: AtomicReference<Request?> = AtomicReference(null)
    private val internalRequestMutex: Mutex = Mutex()
}

class SuspendedRequest<Request, Response>(
    val request: DynamicRequest<Request>,
    private val handle: CompletableDeferred<Response> = CompletableDeferred()
) : CompletableDeferred<Response> by handle

interface DynamicExecutor<Request, Response> : Executor<Request, Response> {
    suspend fun execute(dynamicRequest: DynamicRequest<Request>): Response

    override suspend fun execute(request: Request): Response {
        return execute(object : DynamicRequest<Request>() {
            override val isIncompleteBatch: Boolean = false
            override suspend fun finalize(): Request = request
        })
    }
}
