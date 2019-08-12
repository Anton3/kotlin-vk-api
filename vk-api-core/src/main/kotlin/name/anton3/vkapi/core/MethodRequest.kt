package name.anton3.vkapi.core

import name.anton3.executors.core.DynamicRequest
import name.anton3.vkapi.method.VkMethod

/**
 * `true`, if the method is allowed to be used in VK Execute method.
 * Default: `false`
 */
object SupportsVkScript : DynamicRequest.Key<Boolean>


/**
 * An extension of SimpleDynamicRequest that has SupportsVkScript key.
 */
data class SimpleMethodRequest<T>(
    private val request: VkMethod<T, *>,
    private val supportsBatch: Boolean = request.supportsBatch()
) : DynamicRequest<VkMethod<T, *>> {

    override suspend fun get(): VkMethod<T, *> = request

    @Suppress("UNCHECKED_CAST")
    override fun <T : Any> get(key: DynamicRequest.Key<T>): T? = when (key) {
        is SupportsVkScript -> supportsBatch as T
        else -> null
    }
}

fun VkMethod<*, *>.supportsBatch(): Boolean {
    return when (apiMethodName.substringBefore('.')) {
        "execute" -> false
        "messages" -> apiMethodName.substringAfter('.') != "setChatPhoto"
        else -> true
    }
}
