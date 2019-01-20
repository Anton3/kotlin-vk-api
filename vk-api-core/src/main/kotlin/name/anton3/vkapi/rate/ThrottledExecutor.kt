package name.anton3.vkapi.rate

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ClosedReceiveChannelException
import kotlinx.coroutines.channels.ClosedSendChannelException
import kotlinx.coroutines.launch
import kotlinx.coroutines.time.delay
import java.time.Duration
import java.time.Instant
import kotlin.coroutines.CoroutineContext

class ThrottledExecutor<Request, Response>(
    private val base: DynamicExecutor<Request, Response>,
    override val coroutineContext: CoroutineContext,
    rateLimit: Int,
    private val ratePeriod: Duration
) : DynamicExecutor<Request, Response>, AsyncCloseable, CoroutineScope {

    private val tickets: Channel<Instant> = Channel(rateLimit)
    private val requests: MutableSet<SuspendedRequest<Request, Response>> = LinkedHashSet()
    private val newRequests: Channel<SuspendedRequest<Request, Response>> = Channel()
    private val schedulerJob: Job

    init {
        require(rateLimit > 0 && ratePeriod > Duration.ZERO)

        val now = Instant.now()
        repeat(rateLimit) { tickets.offer(now) }

        schedulerJob = launch {
            while (true) {
                if (!receiveTicket()) break
                if (!receiveRequest()) break
                val request = takeRequest()
                sendRequest(request)
            }
        }
    }

    override suspend fun execute(dynamicRequest: DynamicRequest<Request>): Response = dynamicRequest.submit {
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
            !requests.isEmpty()
        }
    }

    private fun takeRequest(): SuspendedRequest<Request, Response> {
        val request = requests.find { !it.request.isIncompleteBatch } ?: requests.first()
        requests.remove(request)
        return request
    }

    private fun sendRequest(suspendedRequest: SuspendedRequest<Request, Response>) {
        launch {
            try {
                base.execute(suspendedRequest)
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
        newRequests.close()
        tickets.close()
    }

    override suspend fun join() {
        schedulerJob.join()
    }
}
