package name.alatushkin.vkapi.executors

import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.json.deserializeResponse
import name.alatushkin.vkapi.json.toUrlParams
import name.alatushkin.vkapi.tokens.Token
import name.alatushkin.vkapi.vktypes.VkResponse
import name.alatushkin.httpclient.HttpClient
import name.alatushkin.httpclient.HttpMethod
import name.alatushkin.httpclient.RequestBody

data class SimpleMethodExecutor(override val httpClient: HttpClient) : MethodExecutor {

    override suspend operator fun <T> invoke(method: VkMethod<T>, token: Token<*>): VkResponse<T> {
        token.attachTo(method)
        val params = method.toUrlParams()

        val httpRequest = HttpMethod.POST(
            url = methodUrl(method),
            body = RequestBody.FormUrlEncoded(params)
        )
        val response = httpClient(httpRequest)

        return method.deserializeResponse(response.data)
    }

    private fun methodUrl(method: VkMethod<*>) = URL_PREFIX + method.apiMethodName

    companion object {
        const val URL_PREFIX = "https://vkapi.com/method/"
    }
}
