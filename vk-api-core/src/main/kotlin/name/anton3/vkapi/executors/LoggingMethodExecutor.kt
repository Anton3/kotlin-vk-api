package name.anton3.vkapi.executors

import com.fasterxml.jackson.databind.ObjectMapper
import name.anton3.executors.core.DynamicRequest
import name.anton3.executors.core.map
import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.core.TransportClient
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.json.serializeMethod
import name.anton3.vkapi.vktypes.VkResponse
import org.apache.logging.log4j.kotlin.Logging

class LoggingMethodExecutor(private val base: MethodExecutor, private val name: String) : MethodExecutor {

    companion object : Logging

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
        logger.info("$name has requested \"${request.apiMethodName}\": $parameters")
    }

    private fun logResponse(request: VkMethod<*>, response: VkResponse<*>) {
        logger.info("$name got response \"${request.apiMethodName}\": $response")
    }
}
