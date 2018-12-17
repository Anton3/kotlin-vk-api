package name.alatushkin.vkapi.executors

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.time.delay
import java.time.Duration
import java.time.Instant
import java.util.concurrent.atomic.AtomicInteger

class Throttler(rateLimit: Int, private val ratePeriod: Duration) {
    
    init {
        require(rateLimit > 0 && ratePeriod > Duration.ZERO)

        val now = Instant.now()
        repeat(rateLimit) { tickets.offer(now) }
    }

    private val tickets: Channel<Instant> = Channel(rateLimit)
    private val ticketsLeft: AtomicInteger = AtomicInteger(rateLimit)

    suspend operator fun <T> invoke(block: suspend () -> T): T {
        ticketsLeft.getAndDecrement()
        val token = tickets.receive()
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

    fun close() {
        tickets.cancel()
    }
}
