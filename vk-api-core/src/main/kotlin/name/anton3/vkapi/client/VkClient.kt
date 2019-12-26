package name.anton3.vkapi.client

import com.fasterxml.jackson.databind.ObjectMapper
import kotlinx.coroutines.CancellationException
import name.anton3.executors.core.DynamicRequest
import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.transport.TransportClient
import name.anton3.vkapi.core.executeTyped
import name.anton3.vkapi.core.extractSimpleResult
import name.anton3.vkapi.method.*
import java.io.IOException

inline fun <T> swallow(block: () -> T): T? {
    return try {
        block()
    } catch (e: CancellationException) {
        if (generateSequence<Throwable>(e) { it.cause }.any { "Fail to execute request" in it.message.orEmpty() }) {
            // Ktor uses CancellationException as their normal exceptions >:(
            // see io.ktor.client.engine.apache.ApacheResponseConsumer.failed
            null
        } else {
            throw e
        }
    } catch (e: IOException) {
        null
    }
}


class VkClient<in R : MethodRequirement>(val executor: MethodExecutor) {

    inline val transportClient: TransportClient get() = executor.transportClient
    inline val objectMapper: ObjectMapper get() = executor.objectMapper

    inline val unchecked: UncheckedClient
        @Suppress("UNCHECKED_CAST")
        get() = this as UncheckedClient

    suspend inline operator fun <T> invoke(dynamicMethod: DynamicRequest<VkMethod<T, R>>): T {
        return executor.executeTyped(dynamicMethod).extractSimpleResult().unwrap()
    }

    suspend inline operator fun <T> invoke(method: VkMethod<T, R>): T {
        return executor.executeTyped(method).extractSimpleResult().unwrap()
    }
}

typealias UncheckedClient = VkClient<MethodRequirement>
typealias UserClient = VkClient<UserMethod>
typealias GroupClient = VkClient<GroupMethod>
typealias ServiceClient = VkClient<ServiceMethod>
typealias UserGroupClient = VkClient<UserGroupMethod>
