package name.alatushkin.vkapi.methods.execute

import name.alatushkin.vkapi.client.VkClient
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.core.VkResult
import name.alatushkin.vkapi.tokens.UserOrGroupMethod

suspend inline fun VkClient<*>.batchUnchecked(methods: List<VkMethod<*>>): List<VkResult<*>> =
    executor.batchUnchecked(methods, token)

@Suppress("UNCHECKED_CAST")
suspend inline fun <T, M> VkClient<M>.batch(methods: List<M>): List<VkResult<T>>
        where M : VkMethod<T>, M : UserOrGroupMethod =
    executor.batchUnchecked(methods, token) as List<VkResult<T>>
