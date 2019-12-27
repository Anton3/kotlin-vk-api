package name.anton3.vkapi.executors

import com.fasterxml.jackson.databind.ObjectMapper
import name.anton3.executors.core.DynamicRequest
import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.json.core.deserializeResponse
import name.anton3.vkapi.json.core.serializeMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.transport.TransportClient
import name.anton3.vkapi.transport.decodeToString
import name.anton3.vkapi.transport.post
import name.anton3.vkapi.vktypes.VkResponse

data class JsonApiMethodExecutor(
    override val transportClient: TransportClient,
    override val objectMapper: ObjectMapper
) : MethodExecutor {

    override suspend fun execute(dynamicRequest: DynamicRequest<VkMethod<*, *>>): VkResponse<*> {
        val request = dynamicRequest.get()
        val params = objectMapper.serializeMethod(request)
        val response = transportClient.post(URL_PREFIX + request.apiMethodName) {
            params.forEach { text(it.key, it.value) }
        }
        return objectMapper.deserializeResponse(request, response.decodeToString())
    }

    companion object {
        private const val URL_PREFIX = "https://api.vk.com/method/"
    }
}
