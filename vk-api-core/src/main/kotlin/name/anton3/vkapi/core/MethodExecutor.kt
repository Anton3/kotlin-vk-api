package name.anton3.vkapi.core

import com.fasterxml.jackson.databind.ObjectMapper
import name.anton3.vkapi.rate.RatedExecutor
import name.anton3.vkapi.vktypes.VkResponse

interface MethodExecutor : RatedExecutor<VkMethod<*>, VkResponse<*>> {
    val httpClient: TransportClient
    val objectMapper: ObjectMapper
}

suspend operator fun <T> MethodExecutor.invoke(method: VkMethod<T>): VkResponse<T> {
    @Suppress("UNCHECKED_CAST")
    return execute(method) as VkResponse<T>
}
