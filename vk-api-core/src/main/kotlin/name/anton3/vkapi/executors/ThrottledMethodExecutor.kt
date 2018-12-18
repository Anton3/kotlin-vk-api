package name.anton3.vkapi.executors

import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.Token
import name.anton3.vkapi.vktypes.VkResponse
import java.time.Duration

class ThrottledMethodExecutor(
    private val base: MethodExecutor,
    rateLimit: Int,
    ratePeriod: Duration = Duration.ofSeconds(1L)
) : MethodExecutor by base {

    private val throttler = Throttler(rateLimit, ratePeriod)

    override suspend fun <T> invoke(method: VkMethod<T>, token: Token<*>): VkResponse<T> =
        throttler { base(method, token) }
}
