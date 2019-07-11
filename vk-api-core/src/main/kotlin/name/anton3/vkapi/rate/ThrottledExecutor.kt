package name.anton3.vkapi.rate

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Semaphore
import kotlinx.coroutines.time.delay
import java.io.Closeable
import java.time.Duration
import java.util.*
import java.util.concurrent.ConcurrentLinkedQueue
import kotlin.coroutines.CoroutineContext

class ThrottledExecutor<Request, Response>(
    private val base: DynamicExecutor<Request, Response>,
    coroutineContext: CoroutineContext,
    rateLimit: Int,
    private val ratePeriod: Duration
) : DynamicExecutor<Request, Response>, Closeable {

    private val job: Job = Job(parent = coroutineContext[Job])
    private val coroutineContext: CoroutineContext = coroutineContext + job
    private val coroutineScope: CoroutineScope = CoroutineScope(this.coroutineContext)

    private val timeTickets: Semaphore = Semaphore(rateLimit)
    private val requestTickets: Semaphore = Semaphore(Int.MAX_VALUE, Int.MAX_VALUE)
    private val requests: Queue<CompletableRequest<Request, Response>> = ConcurrentLinkedQueue()

    init {
        require(rateLimit > 0 && ratePeriod > Duration.ZERO)

        coroutineScope.launch {
            while (isActive) handleNextRequest()
        }
    }

    override suspend fun execute(dynamicRequest: DynamicRequest<Request>): Response {
        return dynamicRequest.submit(coroutineContext) {
            requests.add(it)
            requestTickets.release()
        }
    }

    private suspend fun handleNextRequest() {
        timeTickets.acquire()
        requestTickets.acquire()
        val request = requests.find { !it.request.isIncompleteBatch } ?: requests.first()
        requests.remove(request)

        coroutineScope.launch {
            try {
                base.complete(request)
            } finally {
                coroutineScope.launch {
                    delay(ratePeriod)
                    timeTickets.release()
                }
            }
        }
    }

    override fun close() {
        job.cancel()
    }
}
