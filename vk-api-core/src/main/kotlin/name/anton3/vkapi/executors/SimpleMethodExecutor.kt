package name.anton3.vkapi.executors

import com.fasterxml.jackson.databind.ObjectMapper
import name.anton3.vkapi.core.*
import name.anton3.vkapi.rate.RequestProducer
import name.anton3.vkapi.json.deserializeResponse
import name.anton3.vkapi.json.serializeMethod
import name.anton3.vkapi.vktypes.VkResponse
import kotlin.coroutines.CoroutineContext

data class SimpleMethodExecutor(
    override val coroutineContext: CoroutineContext,
    override val httpClient: TransportClient,
    override val objectMapper: ObjectMapper
) : MethodExecutor {

    override suspend fun execute(request: VkMethod<*>): VkResponse<*> {
        val params = objectMapper.serializeMethod(request)
        val response = httpClient.post(
            url = URL_PREFIX + request.apiMethodName,
            content = RequestContent.Form(params)
        )
        return objectMapper.deserializeResponse(request, response.data)
    }

    override val rateLeft: Int
        get() = Int.MAX_VALUE

    override fun addRequestProducer(producer: RequestProducer<VkMethod<*>, VkResponse<*>>) = Unit

    companion object {
        private const val URL_PREFIX = "https://api.vk.com/method/"
    }
}
