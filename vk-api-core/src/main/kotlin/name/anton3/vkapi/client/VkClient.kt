@file:Suppress("NOTHING_TO_INLINE")

package name.anton3.vkapi.client

import com.fasterxml.jackson.databind.ObjectMapper
import name.anton3.executors.core.DynamicRequest
import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.core.TransportClient
import name.anton3.vkapi.core.executeTyped
import name.anton3.vkapi.core.extractSimpleResult
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.MethodRequirement
import name.anton3.vkapi.method.VkMethod
import java.io.IOException

inline fun <T> swallow(block: () -> T): T? {
    return try {
        block()
    } catch (e: IOException) {
        null
    }
}


internal interface BasicVkClient {
    val executor: MethodExecutor
    val transportClient: TransportClient get() = executor.transportClient
    val objectMapper: ObjectMapper get() = executor.objectMapper
}

class UncheckedClient(override val executor: MethodExecutor) : BasicVkClient {

    suspend inline operator fun <T> invoke(dynamicMethod: DynamicRequest<VkMethod<T>>): T {
        return executor.executeTyped(dynamicMethod).extractSimpleResult().unwrap()
    }

    suspend inline operator fun <T> invoke(method: VkMethod<T>): T {
        return executor.executeTyped(method).extractSimpleResult().unwrap()
    }
}

class VkClient<in R : MethodRequirement>(val unchecked: UncheckedClient) : BasicVkClient {
    constructor(executor: MethodExecutor) : this(UncheckedClient(executor))

    override val executor: MethodExecutor get() = unchecked.executor

    suspend inline operator fun <T> invoke(dynamicMethod: DynamicRequest<CheckedMethod<T, R>>): T = unchecked(dynamicMethod)
    suspend inline operator fun <T> invoke(method: CheckedMethod<T, R>): T = unchecked(method)
}
