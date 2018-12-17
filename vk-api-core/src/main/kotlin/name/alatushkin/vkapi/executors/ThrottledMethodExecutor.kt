package name.alatushkin.vkapi.executors

import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.Token
import name.alatushkin.vkapi.vktypes.VkResponse
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
