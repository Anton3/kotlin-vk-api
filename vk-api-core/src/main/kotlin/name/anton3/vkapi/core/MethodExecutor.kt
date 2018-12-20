package name.anton3.vkapi.core

import com.fasterxml.jackson.databind.ObjectMapper
import name.anton3.vkapi.vktypes.VkResponse

interface MethodExecutor {
    suspend operator fun <T> invoke(method: VkMethod<T>): VkResponse<T>

    val httpClient: TransportClient
    val objectMapper: ObjectMapper
}
