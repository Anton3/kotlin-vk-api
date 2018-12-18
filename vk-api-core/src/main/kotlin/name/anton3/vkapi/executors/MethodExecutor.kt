package name.anton3.vkapi.executors

import com.fasterxml.jackson.databind.ObjectMapper
import name.anton3.vkapi.core.TransportClient
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.Token
import name.anton3.vkapi.vktypes.VkResponse

interface MethodExecutor {
    suspend operator fun <T> invoke(method: VkMethod<T>, token: Token<*>): VkResponse<T>

    val httpClient: TransportClient
    val objectMapper: ObjectMapper
}
