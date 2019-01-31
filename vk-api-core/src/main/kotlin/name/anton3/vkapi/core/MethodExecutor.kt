package name.anton3.vkapi.core

import com.fasterxml.jackson.databind.ObjectMapper
import name.anton3.vkapi.rate.DynamicExecutor
import name.anton3.vkapi.rate.DynamicRequest
import name.anton3.vkapi.rate.SimpleDynamicRequest
import name.anton3.vkapi.vktypes.VkResponse

interface MethodExecutor : DynamicExecutor<VkMethod<*>, VkResponse<*>> {
    val httpClient: TransportClient
    val objectMapper: ObjectMapper
}

suspend fun <T> MethodExecutor.executeTyped(dynamicMethod: DynamicRequest<VkMethod<T>>): VkResponse<T> {
    @Suppress("UNCHECKED_CAST")
    return execute(dynamicMethod) as VkResponse<T>
}

suspend fun <T> MethodExecutor.execute(method: VkMethod<T>): VkResponse<T> {
    return executeTyped(SimpleDynamicRequest(method, canBeBatched = method.supportsBatch()))
}
