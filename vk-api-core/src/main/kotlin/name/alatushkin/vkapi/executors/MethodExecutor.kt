package name.alatushkin.vkapi.executors

import com.fasterxml.jackson.databind.ObjectMapper
import name.alatushkin.httpclient.HttpClient
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.Token
import name.alatushkin.vkapi.vktypes.VkResponse

interface MethodExecutor {
    suspend operator fun <T> invoke(method: VkMethod<T>, token: Token<*>): VkResponse<T>

    val httpClient: HttpClient
    val objectMapper: ObjectMapper
}
