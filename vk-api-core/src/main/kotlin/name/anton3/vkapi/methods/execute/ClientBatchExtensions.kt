package name.anton3.vkapi.methods.execute

import name.anton3.vkapi.client.VkClient
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.core.VkResult
import name.anton3.vkapi.tokens.UserOrGroupMethod

suspend inline fun VkClient<*>.batchUnchecked(methods: List<VkMethod<*>>): List<VkResult<*>> =
    executor.batchUnchecked(methods, token)

@Suppress("UNCHECKED_CAST")
suspend inline fun <T, M> VkClient<M>.batch(methods: List<M>): List<VkResult<T>>
        where M : VkMethod<T>, M : UserOrGroupMethod =
    executor.batchUnchecked(methods, token) as List<VkResult<T>>
