package name.anton3.vkapi.executors

import com.fasterxml.jackson.databind.ObjectMapper
import name.anton3.vkapi.client.VkClient
import name.anton3.vkapi.core.TransportClient
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.core.post
import name.anton3.vkapi.json.deserializeResponse
import name.anton3.vkapi.json.serializeMethod
import name.anton3.vkapi.tokens.MethodRequirement
import name.anton3.vkapi.tokens.Token
import name.anton3.vkapi.vktypes.VkResponse
import java.net.URLEncoder

data class SimpleMethodExecutor(
    override val httpClient: TransportClient,
    override val objectMapper: ObjectMapper
) : MethodExecutor {

    override suspend operator fun <T> invoke(method: VkMethod<T>, token: Token<*>): VkResponse<T> {
        token.attachTo(method)
        val params = objectMapper.serializeMethod(method)
        val response = httpClient.post(methodUrl(method.apiMethodName, params))
        return objectMapper.deserializeResponse(method, response.data)
    }

    fun <M : MethodRequirement> withToken(token: Token<M>): VkClient<M> = VkClient(this, token)

    private fun methodUrl(name: String, params: Map<String, String>): String {
        val paramsString = params.entries.joinToString("&", prefix = "?") {
            "${it.key}=${URLEncoder.encode(it.value, "UTF-8")}"
        }
        return URL_PREFIX + name + (if (params.isNotEmpty()) paramsString else "")
    }

    companion object {
        private const val URL_PREFIX = "https://api.vk.com/method/"
    }
}
