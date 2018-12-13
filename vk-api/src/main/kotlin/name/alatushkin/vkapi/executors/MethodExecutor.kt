package name.alatushkin.vkapi.executors

import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.Token
import name.alatushkin.vkapi.vktypes.VkResponse
import name.alatushkin.httpclient.HttpClient

interface MethodExecutor {
    suspend operator fun <T> invoke(method: VkMethod<T>, token: Token<*>): VkResponse<T>
    val httpClient: HttpClient
}
