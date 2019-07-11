package name.anton3.vkapi.rate

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.time.delay
import java.io.Closeable
import java.time.Duration
import java.time.Instant
import java.util.*
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

    private val tickets: Channel<Instant> = Channel(rateLimit)
    private val requests: Queue<CompletableRequest<Request, Response>> = ArrayDeque()
    private val requestsMutex: Mutex = Mutex()

    init {
        require(rateLimit > 0 && ratePeriod > Duration.ZERO)

        val now = Instant.now()
        repeat(rateLimit) { tickets.offer(now) }
    }

    override suspend fun execute(dynamicRequest: DynamicRequest<Request>): Response {
        return dynamicRequest.submit(coroutineContext) {
            requestsMutex.withLock { requests.add(it) }
            sendSomeRequest()
        }
    }

    private suspend fun sendSomeRequest() {
        delay(Duration.between(Instant.now(), tickets.receive()))

        val request = requestsMutex.withLock {
            requests.findAndRemove { !it.request.isIncompleteBatch } ?: requests.poll()
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

private inline fun <T> MutableIterable<T>.findAndRemove(predicate: (T) -> Boolean): T? {
    with(iterator()) {
        while (hasNext()) {
            val element = next()
            if (predicate(element)) {
                remove()
                return element
            }
        }
    }
    return null
}
