package name.anton3.vkapi.executors

import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ClosedReceiveChannelException
import kotlinx.coroutines.time.delay
import java.time.Duration
import java.time.Instant
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger

class Throttler(private val rateLimit: Int, private val ratePeriod: Duration) : AsyncCloseable {

    private val tickets: Channel<Instant> = Channel(rateLimit)
    private val ticketsLeft: AtomicInteger = AtomicInteger(rateLimit)
    private val isClosed: AtomicBoolean = AtomicBoolean(false)

    init {
        require(rateLimit > 0 && ratePeriod > Duration.ZERO)

        val now = Instant.now()
        repeat(rateLimit) { tickets.offer(now) }
    }

    suspend operator fun <T> invoke(block: suspend () -> T): T {
        if (isClosed.get()) throw CancellationException("Closed Throttler")

        ticketsLeft.getAndDecrement()
        val token = try {
            tickets.receive()
        } catch (e: ClosedReceiveChannelException) {
            Instant.now()
        }

        val waitTime = Duration.between(Instant.now(), token)

        try {
            delay(waitTime)
            return block()
        } finally {
            val newTicket = Instant.now().plus(ratePeriod)
            ticketsLeft.getAndIncrement()
            tickets.offer(newTicket)
        }
    }

    val rateLeft: Int
        get() = ticketsLeft.get()

    val isThrottling: Boolean
        get() = ticketsLeft.get() <= 0

    override fun close() {
        isClosed.set(true)
    }

    override suspend fun join() {
        require(isClosed.get())
        require(ticketsLeft.getAndSet(0) != 0)

        repeat(rateLimit) { tickets.receive() }
        tickets.close()
    }
}
