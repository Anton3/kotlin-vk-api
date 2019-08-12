package name.anton3.vkapi.executors

import com.fasterxml.jackson.databind.ObjectMapper
import name.anton3.executors.core.DynamicRequest
import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.core.RequestContent
import name.anton3.vkapi.core.TransportClient
import name.anton3.vkapi.core.post
import name.anton3.vkapi.json.core.deserializeResponse
import name.anton3.vkapi.json.core.serializeMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkResponse

data class JsonApiMethodExecutor(
    override val transportClient: TransportClient,
    override val objectMapper: ObjectMapper
) : MethodExecutor {

    override suspend fun execute(dynamicRequest: DynamicRequest<VkMethod<*, *>>): VkResponse<*> {
        val request = dynamicRequest.get()
        val params = objectMapper.serializeMethod(request)
        val response = transportClient.post(
            url = URL_PREFIX + request.apiMethodName,
            content = RequestContent.Form(params)
        )
        return objectMapper.deserializeResponse(request, response.data)
    }

    companion object {
        private const val URL_PREFIX = "https://api.vk.com/method/"
    }
}
