package name.anton3.vkapi.rate

import com.fasterxml.jackson.databind.ObjectMapper
import mu.KotlinLogging
import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.core.TransportClient
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.json.serializeMethod
import name.anton3.vkapi.vktypes.VkResponse

private val log = KotlinLogging.logger {}

class LoggingMethodExecutor(private val base: MethodExecutor, private val name: String) : MethodExecutor {

    override suspend fun execute(dynamicRequest: DynamicRequest<VkMethod<*>>): VkResponse<*> {
        val loggingRequest = dynamicRequest.map { request ->
            request.also { logRequest(it) }
        }
        return base.execute(loggingRequest).also { logResponse(loggingRequest.get(), it) }
    }

    override val objectMapper: ObjectMapper get() = base.objectMapper
    override val transportClient: TransportClient get() = base.transportClient

    private fun logRequest(request: VkMethod<*>) {
        val parameters = objectMapper.serializeMethod(request)
        log.info("$name has requested \"${request.apiMethodName}\": $parameters")
    }

    private fun logResponse(request: VkMethod<*>, response: VkResponse<*>) {
        log.info("$name got response \"${request.apiMethodName}\": $response")
    }
}
