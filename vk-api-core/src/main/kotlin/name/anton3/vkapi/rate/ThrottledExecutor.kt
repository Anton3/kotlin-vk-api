package name.anton3.vkapi.rate

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ClosedReceiveChannelException
import kotlinx.coroutines.channels.ClosedSendChannelException
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.time.delay
import java.io.Closeable
import java.time.Duration
import java.time.Instant
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
    private val requests: MutableSet<CompletableRequest<Request, Response>> = LinkedHashSet()
    private val newRequests: Channel<CompletableRequest<Request, Response>> = Channel()

    init {
        require(rateLimit > 0 && ratePeriod > Duration.ZERO)

        val now = Instant.now()
        repeat(rateLimit) { tickets.offer(now) }

        coroutineScope.launch {
            while (isActive) {
                if (!receiveTicket()) break
                if (!receiveRequest()) break
                val request = takeRequest()
                sendRequest(request)
            }
        }
    }

    override suspend fun execute(dynamicRequest: DynamicRequest<Request>): Response = dynamicRequest.submit(coroutineContext) {
        newRequests.send(it)
    }

    private suspend fun receiveTicket(): Boolean {
        val ticket = try {
            tickets.receive()
        } catch (e: ClosedReceiveChannelException) {
            return false
        }

        val now = Instant.now()
        if (ticket > now) delay(Duration.between(now, ticket))
        return true
    }

    private suspend fun receiveRequest(): Boolean {
        return try {
            var newRequest = newRequests.poll()
            while (newRequest != null) {
                requests.add(newRequest)
                newRequest = newRequests.poll()
            }
            if (requests.isEmpty()) {
                newRequest = newRequests.receive()
                requests.add(newRequest)
            }
            true
        } catch (e: ClosedReceiveChannelException) {
            requests.isNotEmpty()
        }
    }

    private fun takeRequest(): CompletableRequest<Request, Response> {
        val request = requests.find { !it.request.isIncompleteBatch } ?: requests.first()
        requests.remove(request)
        return request
    }

    private fun sendRequest(completableRequest: CompletableRequest<Request, Response>) {
        coroutineScope.launch {
            try {
                base.complete(completableRequest)
            } finally {
                try {
                    tickets.send(Instant.now() + ratePeriod)
                } catch (e: ClosedSendChannelException) {
                    // Executor is closed
                }
            }
        }
    }

    override fun close() {
        newRequests.cancel()
        tickets.close()
        job.cancel()
    }
}
