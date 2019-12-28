package name.anton3.vkapi.executors

import com.fasterxml.jackson.databind.ObjectMapper
import name.anton3.executors.core.DynamicRequest
import name.anton3.executors.core.map
import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.json.core.serializeMethod
import name.anton3.vkapi.json.core.serializeResponse
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.transport.TransportClient
import name.anton3.vkapi.transport.quote
import name.anton3.vkapi.vktypes.VkResponse
import org.apache.logging.log4j.kotlin.Logging

class LoggingMethodExecutor(private val base: MethodExecutor, private val name: String) : MethodExecutor {

    override suspend fun execute(dynamicRequest: DynamicRequest<VkMethod<*, *>>): VkResponse<*> {
        val loggingRequest = dynamicRequest.map { request ->
            request.also { logRequest(it) }
        }
        return base.execute(loggingRequest).also { logResponse(loggingRequest.get(), it) }
    }

    override val objectMapper: ObjectMapper get() = base.objectMapper
    override val transportClient: TransportClient get() = base.transportClient

    private fun logRequest(request: VkMethod<*, *>) {
        val requestString = objectMapper.serializeMethod(request)
            .entries.joinToString { "${it.key}=\"${quote(it.value)}\"" }
        logger.info("$name has requested \"${request.apiMethodName}\": $requestString")
    }

    private fun logResponse(request: VkMethod<*, *>, response: VkResponse<*>) {
        val responseString = objectMapper.serializeResponse(request, response)
        logger.info("$name got response \"${request.apiMethodName}\": $responseString")
    }

    private companion object : Logging
}
