package name.anton3.vkapi.executors

import com.fasterxml.jackson.databind.ObjectMapper
import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.core.TransportClient
import name.anton3.vkapi.core.VkMethod
import name.anton3.executors.core.DynamicRequest
import name.anton3.executors.instances.ThrottledExecutor
import name.anton3.vkapi.vktypes.VkResponse
import java.io.Closeable
import java.time.Duration
import kotlin.coroutines.CoroutineContext

class ThrottledMethodExecutor(
    private val base: MethodExecutor,
    coroutineContext: CoroutineContext,
    rateLimit: Int,
    ratePeriod: Duration = Duration.ofSeconds(1L)
) : MethodExecutor, Closeable {

    private val throttler: ThrottledExecutor<VkMethod<*>, VkResponse<*>> =
        ThrottledExecutor(base, coroutineContext, rateLimit, ratePeriod)

    override suspend fun execute(dynamicRequest: DynamicRequest<VkMethod<*>>): VkResponse<*> {
        return throttler.execute(dynamicRequest)
    }

    override val transportClient: TransportClient get() = base.transportClient
    override val objectMapper: ObjectMapper get() = base.objectMapper

    override fun close() {
        throttler.close()
    }
}
