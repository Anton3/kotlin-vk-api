@file:Suppress("NOTHING_TO_INLINE")

package name.anton3.vkapi.client

import com.fasterxml.jackson.databind.ObjectMapper
import name.anton3.vkapi.core.*
import name.anton3.vkapi.rate.DynamicRequest
import name.anton3.vkapi.tokens.*
import java.io.IOException

inline fun <T> swallow(block: () -> T): T? {
    return try {
        block()
    } catch (e: IOException) {
        null
    }
}


interface VkClient {
    val unchecked: UncheckedClient

    val executor: MethodExecutor get() = unchecked.executor
    val httpClient: TransportClient get() = executor.httpClient
    val objectMapper: ObjectMapper get() = executor.objectMapper
}

class UncheckedClient(override val executor: MethodExecutor) : VkClient {
    override val unchecked: UncheckedClient get() = this

    suspend inline operator fun <T> invoke(dynamicMethod: DynamicRequest<VkMethod<T>>): T {
        return executor.executeTyped(dynamicMethod).extractSimpleResult().unwrap()
    }

    suspend inline operator fun <T> invoke(method: VkMethod<T>): T {
        return executor.executeTyped(method).extractSimpleResult().unwrap()
    }
}


class UserClient(override val unchecked: UncheckedClient) : VkClient {
    suspend inline operator fun <T, M> invoke(dynamicMethod: DynamicRequest<M>): T
            where M : VkMethod<T>, M : UserMethod = unchecked(dynamicMethod)

    suspend inline operator fun <T, M> invoke(method: M): T
            where M : VkMethod<T>, M : UserMethod = unchecked(method)

    inline val userGroup: UserGroupClient get() = UserGroupClient(unchecked)
    inline val userService: UserServiceClient get() = UserServiceClient(unchecked)
    inline val userGroupService: UserGroupServiceClient get() = UserGroupServiceClient(unchecked)
}

class GroupClient(override val unchecked: UncheckedClient) : VkClient {
    suspend inline operator fun <T, M> invoke(dynamicMethod: DynamicRequest<M>): T
            where M : VkMethod<T>, M : GroupMethod = unchecked(dynamicMethod)

    suspend inline operator fun <T, M> invoke(method: M): T
            where M : VkMethod<T>, M : GroupMethod = unchecked(method)

    inline val userGroup: UserGroupClient get() = UserGroupClient(unchecked)
    inline val userGroupService: UserGroupServiceClient get() = UserGroupServiceClient(unchecked)
}

class ServiceClient(override val unchecked: UncheckedClient) : VkClient {
    suspend inline operator fun <T, M> invoke(dynamicMethod: DynamicRequest<VkMethod<T>>): T
            where M : VkMethod<T>, M : ServiceMethod = unchecked(dynamicMethod)

    suspend inline operator fun <T, M> invoke(method: VkMethod<T>): T
            where M : VkMethod<T>, M : ServiceMethod = unchecked(method)

    inline val userService: UserServiceClient get() = UserServiceClient(unchecked)
    inline val userGroupService: UserGroupServiceClient get() = UserGroupServiceClient(unchecked)
}

class UserGroupClient(override val unchecked: UncheckedClient) : VkClient {
    suspend inline operator fun <T, M> invoke(dynamicMethod: DynamicRequest<M>): T
            where M : VkMethod<T>, M : UserGroupMethod = unchecked(dynamicMethod)

    suspend inline operator fun <T, M> invoke(method: M): T
            where M : VkMethod<T>, M : UserGroupMethod = unchecked(method)

    inline val userGroupService: UserGroupServiceClient get() = UserGroupServiceClient(unchecked)
}

class UserServiceClient(override val unchecked: UncheckedClient) : VkClient {
    suspend inline operator fun <T, M> invoke(dynamicMethod: DynamicRequest<M>): T
            where M : VkMethod<T>, M : UserServiceMethod = unchecked(dynamicMethod)

    suspend inline operator fun <T, M> invoke(method: M): T
            where M : VkMethod<T>, M : UserServiceMethod = unchecked(method)

    inline val userGroupService: UserGroupServiceClient get() = UserGroupServiceClient(unchecked)
}

class UserGroupServiceClient(override val unchecked: UncheckedClient) : VkClient {
    suspend inline operator fun <T, M> invoke(dynamicMethod: DynamicRequest<M>): T
            where M : VkMethod<T>, M : UserGroupServiceMethod = unchecked(dynamicMethod)

    suspend inline operator fun <T, M> invoke(method: M): T
            where M : VkMethod<T>, M : UserGroupServiceMethod = unchecked(method)
}

inline fun UserClient(executor: MethodExecutor): UserClient = UserClient(UncheckedClient(executor))
inline fun GroupClient(executor: MethodExecutor): GroupClient = GroupClient(UncheckedClient(executor))
inline fun ServiceClient(executor: MethodExecutor): ServiceClient = ServiceClient(UncheckedClient(executor))
inline fun UserGroupClient(executor: MethodExecutor): UserGroupClient = UserGroupClient(UncheckedClient(executor))
inline fun UserServiceClient(executor: MethodExecutor): UserServiceClient = UserServiceClient(UncheckedClient(executor))
inline fun UserGroupServiceClient(executor: MethodExecutor): UserGroupServiceClient = UserGroupServiceClient(UncheckedClient(executor))
