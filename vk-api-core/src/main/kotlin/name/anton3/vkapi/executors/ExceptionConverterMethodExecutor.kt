package name.anton3.vkapi.executors

import com.fasterxml.jackson.databind.ObjectMapper
import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.core.TransportClient
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.rate.DynamicRequest
import name.anton3.vkapi.vktypes.VkResponse

class ExceptionConverterMethodExecutor(
    private val base: MethodExecutor,
    private val exceptionConverter: (VkMethod<*>, Throwable) -> Nothing
) : MethodExecutor {

    override suspend fun execute(dynamicRequest: DynamicRequest<VkMethod<*>>): VkResponse<*> {
        return try {
            base.execute(dynamicRequest)
        } catch (e: Throwable) {
            val method = dynamicRequest.get()
            exceptionConverter(method, e)
        }
    }

    override val transportClient: TransportClient get() = base.transportClient
    override val objectMapper: ObjectMapper get() = base.objectMapper
}
