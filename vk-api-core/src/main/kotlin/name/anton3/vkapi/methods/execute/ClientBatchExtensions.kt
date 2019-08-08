package name.anton3.vkapi.methods.execute

import name.anton3.vkapi.client.GroupClient
import name.anton3.vkapi.client.UncheckedClient
import name.anton3.vkapi.client.UserClient
import name.anton3.vkapi.client.UserGroupClient
import name.anton3.vkapi.core.VkResult
import name.anton3.vkapi.method.GroupMethod
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

@Suppress("UNCHECKED_CAST")
suspend inline fun <T> UncheckedClient.batch(methods: List<VkMethod<T>>): List<VkResult<T>> =
    executor.batch(methods) as List<VkResult<T>>

suspend inline fun <T, M> UserClient.batch(methods: List<M>): List<VkResult<T>>
        where M : VkMethod<T>, M : UserMethod = unchecked.batch(methods)

suspend inline fun <T, M> GroupClient.batch(methods: List<M>): List<VkResult<T>>
        where M : VkMethod<T>, M : GroupMethod = unchecked.batch(methods)

suspend inline fun <T, M> UserGroupClient.batch(methods: List<M>): List<VkResult<T>>
        where M : VkMethod<T>, M : UserGroupMethod = unchecked.batch(methods)
