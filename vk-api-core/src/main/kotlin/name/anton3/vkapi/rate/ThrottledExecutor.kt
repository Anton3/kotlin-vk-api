package name.anton3.vkapi.rate

import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ClosedSendChannelException
import kotlinx.coroutines.launch
import kotlinx.coroutines.time.delay
import java.time.Duration
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger
import kotlin.coroutines.CoroutineContext

class ThrottledExecutor<Request, Response>(
    private val base: RatedExecutor<Request, Response>,
    private val rateLimit: Int,
    private val ratePeriod: Duration
) : RatedExecutor<Request, Response>,
    AsyncCloseable {

    private val tickets: Channel<Unit> = Channel(rateLimit)
    private val ticketsLeft: AtomicInteger = AtomicInteger(rateLimit)
    private val isClosed: AtomicBoolean = AtomicBoolean(false)
    private val requestProducers: RequestProducers<Request, Response> =
        RequestProducers()

    init {
        require(rateLimit > 0 && ratePeriod > Duration.ZERO)
        repeat(rateLimit) { tickets.offer(Unit) }
    }

    override val coroutineContext: CoroutineContext
        get() = base.coroutineContext

    override suspend fun execute(request: Request): Response {
        if (isClosed.get()) throw CancellationException("Closed ThrottledExecutor")
        ticketsLeft.getAndDecrement()
        tickets.receive()

        return executeWithTicket(request)
    }

    private suspend fun executeWithTicket(request: Request): Response {
        return try {
            base.execute(request)
        } finally {
            launch {
                delay(ratePeriod)

                val hasFreeRate = ticketsLeft.get() >= 0 && !base.isThrottling
                val suspendedRequest = if (hasFreeRate) requestProducers.produceRequest() else null

                if (suspendedRequest != null) {
                    suspendedRequest.complete { executeWithTicket(it) }
                } else {
                    ticketsLeft.getAndIncrement()
                    try {
                        tickets.offer(Unit)
                    } catch (e: ClosedSendChannelException) {
                    }
                }
            }
        }
    }

    override val rateLeft: Int
        get() = minOf(ticketsLeft.get(), base.rateLeft)

    override fun addRequestProducer(producer: RequestProducer<Request, Response>) {
        requestProducers.add(producer)

        base.addRequestProducer(object : RequestProducer<Request, Response> {
            override val isUrgent: Boolean
                get() = producer.isUrgent && !this@ThrottledExecutor.isThrottling

            override suspend fun sendRequest(): SuspendedRequest<Request, Response>? {
                if (this@ThrottledExecutor.isThrottling) return null
                return producer.sendRequest()
            }
        })
    }

    override fun close() {
        isClosed.set(true)
    }

    override suspend fun join() {
        require(isClosed.get())
        repeat(rateLimit) {
            ticketsLeft.getAndDecrement()
            tickets.receive()
        }
        tickets.close()
    }
}
