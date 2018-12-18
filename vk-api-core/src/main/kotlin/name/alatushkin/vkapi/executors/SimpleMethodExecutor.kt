package name.alatushkin.vkapi.executors

import com.fasterxml.jackson.databind.ObjectMapper
import name.alatushkin.vkapi.client.VkClient
import name.alatushkin.vkapi.core.TransportClient
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.core.post
import name.alatushkin.vkapi.json.deserializeResponse
import name.alatushkin.vkapi.json.serializeMethod
import name.alatushkin.vkapi.tokens.MethodRequirement
import name.alatushkin.vkapi.tokens.Token
import name.alatushkin.vkapi.vktypes.VkResponse

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
        val paramsString = params.entries.joinToString("&", prefix = "?") { "${it.key}=${it.value}" }
        return URL_PREFIX + name + (if (params.isNotEmpty()) paramsString else "")
    }

    companion object {
        private const val URL_PREFIX = "https://vkapi.com/method/"
    }
}
