package name.anton3.executors.instances

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.time.delay
import name.anton3.executors.core.DynamicExecutor
import name.anton3.executors.core.DynamicRequest
import name.anton3.executors.core.RequestStorage
import name.anton3.executors.util.FifoRequestStorage
import name.anton3.executors.util.complete
import java.io.Closeable
import java.time.Duration
import java.time.Instant
import kotlin.coroutines.CoroutineContext

class ThrottledExecutor<Request, Response>(
    private val base: DynamicExecutor<Request, Response>,
    coroutineContext: CoroutineContext,
    rateLimit: Int,
    private val ratePeriod: Duration,
    override val requestStorage: RequestStorage<Request> = FifoRequestStorage()
) : StoringDynamicExecutor<Request, Response>(), Closeable {

    override val job: Job = SupervisorJob(parent = coroutineContext[Job])
    private val coroutineScope: CoroutineScope = CoroutineScope(coroutineContext + job)
    private val tickets: Channel<Instant> = Channel(rateLimit)

    init {
        require(rateLimit > 0 && ratePeriod >= Duration.ZERO)

        val now = Instant.now()
        repeat(rateLimit) { tickets.offer(now) }
    }

    override suspend fun execute(dynamicRequest: DynamicRequest<Request>): Response = submit(dynamicRequest) {
        sendSomeRequest()
    }

    private suspend fun sendSomeRequest() {
        val ticket = tickets.receive()
        delay(Duration.between(Instant.now(), ticket))

        val request = try {
            poll()
        } catch (e: Throwable) {
            tickets.offer(Instant.now())
            throw e
        }

        coroutineScope.launch {
            base.complete(request)
            tickets.offer(Instant.now() + ratePeriod)
        }
    }

    override fun close() {
        tickets.cancel()
        job.cancel()
    }
}
