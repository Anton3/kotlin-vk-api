package name.anton3.executors.instances

import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import name.anton3.executors.core.Executor
import name.anton3.executors.util.complete

class DistinctExecutor<Request, Response>(
    private val base: Executor<Request, Response>
) : Executor<Request, Response> {

    private val pendingRequests: MutableMap<Request, CompletableDeferred<Response>> = mutableMapOf()
    private val mutex: Mutex = Mutex()

    override suspend fun execute(request: Request): Response {
        var isFirst = false
        val handle = mutex.withLock {
            pendingRequests.getOrPut(request) {
                isFirst = true
                CompletableDeferred()
            }
        }

        if (isFirst) handle.complete { base.execute(request) }
        return handle.await()
    }
}
