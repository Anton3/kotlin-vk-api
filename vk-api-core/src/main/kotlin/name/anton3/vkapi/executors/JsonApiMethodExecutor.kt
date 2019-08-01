package name.anton3.vkapi.executors

import com.fasterxml.jackson.databind.ObjectMapper
import name.anton3.vkapi.core.*
import name.anton3.vkapi.json.deserializeResponse
import name.anton3.vkapi.json.serializeMethod
import name.anton3.executors.core.DynamicRequest
import name.anton3.vkapi.vktypes.VkResponse

data class JsonApiMethodExecutor(
    override val transportClient: TransportClient,
    override val objectMapper: ObjectMapper
) : MethodExecutor {

    override suspend fun execute(dynamicRequest: DynamicRequest<VkMethod<*>>): VkResponse<*> {
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
