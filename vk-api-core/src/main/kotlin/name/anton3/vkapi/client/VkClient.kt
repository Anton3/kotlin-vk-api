package name.anton3.vkapi.client

import com.fasterxml.jackson.databind.ObjectMapper
import name.anton3.vkapi.core.*
import name.anton3.vkapi.rate.DynamicRequest
import name.anton3.vkapi.rate.MappedDynamicRequest
import name.anton3.vkapi.tokens.MethodRequirement
import name.anton3.vkapi.tokens.Token
import name.anton3.vkapi.tokens.attach
import java.io.IOException

data class VkClient<in M: MethodRequirement>(val executor: MethodExecutor, val token: Token<M>) {
    val httpClient: TransportClient get() = executor.httpClient
    val objectMapper: ObjectMapper get() = executor.objectMapper

    suspend fun <T> unchecked(dynamicRequest: DynamicRequest<VkMethod<T>>): T {
        val withToken: DynamicRequest<VkMethod<T>> = MappedDynamicRequest(dynamicRequest) { it.attach(token) }
        return executor.executeTyped(withToken).extractSimpleResult().unwrap()
    }

    suspend fun <T> unchecked(method: VkMethod<T>): T {
        return executor.execute(method.attach(token)).extractSimpleResult().unwrap()
    }

    suspend fun <T> uncheckedSwallowing(dynamicRequest: DynamicRequest<VkMethod<T>>): T? {
        return try {
            unchecked(dynamicRequest)
        } catch (e: IOException) {
            null
        }
    }

    suspend fun <T> uncheckedSwallowing(method: VkMethod<T>): T? {
        return try {
            unchecked(method)
        } catch (e: IOException) {
            null
        }
    }
}

suspend inline operator fun <T, M> VkClient<M>.invoke(method: M): T
        where M : VkMethod<T>, M : MethodRequirement = unchecked(method)

suspend inline fun <T, M> VkClient<M>.swallowing(method: M): T?
        where M : VkMethod<T>, M : MethodRequirement = uncheckedSwallowing(method)

fun <M: MethodRequirement> MethodExecutor.attach(token: Token<M>): VkClient<M> =
    VkClient(this, token)
