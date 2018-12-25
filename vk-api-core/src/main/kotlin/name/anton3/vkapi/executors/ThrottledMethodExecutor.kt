package name.anton3.vkapi.executors

import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.vktypes.VkResponse
import java.time.Duration

class ThrottledMethodExecutor(
    private val base: MethodExecutor,
    rateLimit: Int,
    ratePeriod: Duration = Duration.ofSeconds(1L)
) : MethodExecutor by base, RateProvider, AsyncCloseable {

    private val throttler = Throttler(rateLimit, ratePeriod)

    override suspend fun <T> invoke(method: VkMethod<T>): VkResponse<T> =
        throttler { base(method) }

    override val rateLeft: Int
        get() = throttler.rateLeft

    override fun setFreeRateHandler(handler: () -> Unit) {
        throttler.setFreeRateHandler(handler)
    }

    override fun close() {
        throttler.close()
    }

    override suspend fun join() {
        throttler.join()
    }
}
