package name.anton3.executors.instances

import kotlinx.coroutines.*
import kotlinx.coroutines.sync.Semaphore
import kotlinx.coroutines.sync.withPermit
import kotlinx.coroutines.time.delay
import name.anton3.executors.core.DynamicExecutor
import name.anton3.executors.core.DynamicRequest
import name.anton3.executors.core.RequestStorage
import name.anton3.executors.core.TypedRequestStorage
import name.anton3.executors.util.CompletableRequest
import name.anton3.executors.util.FifoRequestStorage
import name.anton3.executors.util.complete
import name.anton3.executors.util.submit
import java.io.Closeable
import java.time.Duration
import kotlin.coroutines.CoroutineContext

class ThrottledExecutor<Request, Response>(
    private val base: DynamicExecutor<Request, Response>,
    coroutineContext: CoroutineContext,
    rateLimit: Int,
    private val ratePeriod: Duration,
    requestStorage: RequestStorage<Request> = FifoRequestStorage()
) : DynamicExecutor<Request, Response>, Closeable {

    private val requestStorage = TypedRequestStorage<Request, CompletableRequest<Request, Response>>(requestStorage)
    private val context: CoroutineContext = coroutineContext + SupervisorJob(parent = coroutineContext[Job])
    private val coroutineScope: CoroutineScope = CoroutineScope(context)
    private val tickets: Semaphore = Semaphore(permits = rateLimit, acquiredPermits = 0)

    init {
        require(rateLimit > 0 && ratePeriod >= Duration.ZERO)
    }

    override suspend fun execute(dynamicRequest: DynamicRequest<Request>): Response = submit(context) { handle ->
        requestStorage.add(CompletableRequest(dynamicRequest, handle))

        coroutineScope.launch {
            tickets.withPermit {
                val otherRequest = requestStorage.poll()
                base.complete(otherRequest)
                delay(ratePeriod)
            }
        }
    }

    override fun close() {
        context.cancel()
    }
}
