package name.anton3.vkapi.core

import com.fasterxml.jackson.databind.ObjectMapper
import name.anton3.executors.core.DynamicExecutor
import name.anton3.executors.core.DynamicRequest
import name.anton3.vkapi.vktypes.VkResponse

/**
 * `true`, if the method is allowed to be used in VK Execute method.
 * Default: `false`
 */
object SupportsVkScript : DynamicRequest.Key<Boolean>


/**
 * An extension of SimpleDynamicRequest that has SupportsVkScript key.
 */
data class SimpleMethodRequest<T>(
    private val request: VkMethod<T>,
    private val supportsBatch: Boolean = request.supportsBatch()
) : DynamicRequest<VkMethod<T>> {

    override suspend fun get(): VkMethod<T> = request

    @Suppress("UNCHECKED_CAST")
    override fun <T : Any> get(key: DynamicRequest.Key<T>): T? = when (key) {
        is SupportsVkScript -> supportsBatch as T
        else -> null
    }
}


interface MethodExecutor : DynamicExecutor<VkMethod<*>, VkResponse<*>> {
    val transportClient: TransportClient
    val objectMapper: ObjectMapper

    override suspend fun execute(request: VkMethod<*>): VkResponse<*> {
        return execute(SimpleMethodRequest(request))
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
