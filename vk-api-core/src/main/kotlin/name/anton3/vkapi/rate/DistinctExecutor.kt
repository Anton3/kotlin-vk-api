package name.anton3.vkapi.rate

import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlin.coroutines.CoroutineContext

class DistinctExecutor<Request, Response>(
    private val base: Executor<Request, Response>,
    override val coroutineContext: CoroutineContext
) : Executor<Request, Response>, CoroutineScope {

    private val pendingRequests: MutableMap<Request, CompletableDeferred<Response>> = mutableMapOf()
    private val mutex: Mutex = Mutex()

    override suspend fun execute(request: Request): Response {
        var isFirst = true
        val handle = mutex.withLock {
            pendingRequests.getOrPut(request) {
                isFirst = false
                CompletableDeferred()
            }
        }

        if (isFirst) handle.complete { base.execute(request) }
        return handle.await()
    }
}
