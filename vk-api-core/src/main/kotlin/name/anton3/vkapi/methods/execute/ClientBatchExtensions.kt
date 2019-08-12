package name.anton3.vkapi.methods.execute

import name.anton3.vkapi.client.VkClient
import name.anton3.vkapi.core.VkResult
import name.anton3.vkapi.method.UserOrGroupMethod
import name.anton3.vkapi.method.VkMethod

@Suppress("UNCHECKED_CAST")
suspend inline fun <T, R : UserOrGroupMethod> VkClient<R>.batch(methods: List<VkMethod<T, R>>): List<VkResult<T>> =
    executor.batch(methods) as List<VkResult<T>>
