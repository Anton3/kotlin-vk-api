package name.alatushkin.vkapi.executors

import com.fasterxml.jackson.databind.ObjectMapper
import name.alatushkin.httpclient.HttpClient
import name.alatushkin.httpclient.HttpMethod
import name.alatushkin.httpclient.RequestBody
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.json.VkMainSerialModule
import name.alatushkin.vkapi.json.VkObjectMapper
import name.alatushkin.vkapi.json.deserializeResponse
import name.alatushkin.vkapi.json.serializeMethod
import name.alatushkin.vkapi.tokens.Token
import name.alatushkin.vkapi.vktypes.VkResponse

data class SimpleMethodExecutor(override val httpClient: HttpClient) : MethodExecutor {

    override val objectMapper: ObjectMapper = VkObjectMapper().registerModule(VkMainSerialModule())

    override suspend operator fun <T> invoke(method: VkMethod<T>, token: Token<*>): VkResponse<T> {
        token.attachTo(method)
        val params = objectMapper.serializeMethod(method)

        val httpRequest = HttpMethod.POST(
            url = methodUrl(method),
            body = RequestBody.FormUrlEncoded(params)
        )
        val response = httpClient(httpRequest)

        return objectMapper.deserializeResponse(method, response.data)
    }

    private fun methodUrl(method: VkMethod<*>) = URL_PREFIX + method.apiMethodName

    companion object {
        const val URL_PREFIX = "https://vkapi.com/method/"
    }
}
