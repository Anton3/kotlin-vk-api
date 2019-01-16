package name.anton3.vkapi.executors

import com.fasterxml.jackson.databind.ObjectMapper
import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.core.TransportClient
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.rate.AsyncCloseable
import name.anton3.vkapi.rate.RequestProducer
import name.anton3.vkapi.rate.ThrottledExecutor
import name.anton3.vkapi.vktypes.VkResponse
import java.time.Duration
import kotlin.coroutines.CoroutineContext

class ThrottledMethodExecutor(
    private val base: MethodExecutor,
    rateLimit: Int,
    ratePeriod: Duration = Duration.ofSeconds(1L)
) : MethodExecutor, AsyncCloseable {

    private val throttler: ThrottledExecutor<VkMethod<*>, VkResponse<*>> =
        ThrottledExecutor(base, rateLimit, ratePeriod)

    override val coroutineContext: CoroutineContext
        get() = base.coroutineContext

    override suspend fun execute(request: VkMethod<*>): VkResponse<*> {
        return throttler.execute(request)
    }

    override val rateLeft: Int
        get() = throttler.rateLeft

    override fun addRequestProducer(producer: RequestProducer<VkMethod<*>, VkResponse<*>>) {
        throttler.addRequestProducer(producer)
    }

    override val httpClient: TransportClient
        get() = base.httpClient

    override val objectMapper: ObjectMapper
        get() = base.objectMapper

    override fun close() {
        throttler.close()
    }

    override suspend fun join() {
        throttler.join()
    }
}
