package name.anton3.vkapi.executors

import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.rate.AsyncCloseable
import name.anton3.vkapi.rate.DynamicRequest
import name.anton3.vkapi.rate.ThrottledExecutor
import name.anton3.vkapi.vktypes.VkResponse
import java.time.Duration
import kotlin.coroutines.CoroutineContext

class ThrottledMethodExecutor(
    private val base: MethodExecutor,
    coroutineContext: CoroutineContext,
    rateLimit: Int,
    ratePeriod: Duration = Duration.ofSeconds(1L)
) : MethodExecutor by base, AsyncCloseable {

    private val throttler: ThrottledExecutor<VkMethod<*>, VkResponse<*>> =
        ThrottledExecutor(base, coroutineContext, rateLimit, ratePeriod)

    override suspend fun execute(dynamicRequest: DynamicRequest<VkMethod<*>>): VkResponse<*> {
        return throttler.execute(dynamicRequest)
    }

    override fun close() {
        throttler.close()
    }

    override suspend fun join() {
        throttler.join()
    }
}
