package name.anton3.vkapi.core

import com.fasterxml.jackson.databind.ObjectMapper
import name.anton3.vkapi.rate.DynamicExecutor
import name.anton3.vkapi.rate.DynamicRequest
import name.anton3.vkapi.rate.SimpleDynamicRequest
import name.anton3.vkapi.vktypes.VkResponse

interface MethodExecutor : DynamicExecutor<VkMethod<*>, VkResponse<*>> {
    val transportClient: TransportClient
    val objectMapper: ObjectMapper

    override suspend fun execute(request: VkMethod<*>): VkResponse<*> {
        return execute(SimpleDynamicRequest(request, canBeBatched = request.supportsBatch()))
    }
}

suspend inline fun <T> MethodExecutor.executeTyped(dynamicMethod: DynamicRequest<VkMethod<T>>): VkResponse<T> {
    @Suppress("UNCHECKED_CAST")
    return execute(dynamicMethod) as VkResponse<T>
}

suspend inline fun <T> MethodExecutor.executeTyped(method: VkMethod<T>): VkResponse<T> {
    @Suppress("UNCHECKED_CAST")
    return execute(method) as VkResponse<T>
}
