package name.anton3.vkapi.client

import com.fasterxml.jackson.databind.ObjectMapper
import name.anton3.vkapi.core.TransportClient
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.core.extractSimpleResult
import name.anton3.vkapi.executors.MethodExecutor
import name.anton3.vkapi.tokens.MethodRequirement
import name.anton3.vkapi.tokens.Token

data class VkClient<in M: MethodRequirement>(val executor: MethodExecutor, val token: Token<M>) {
    val httpClient: TransportClient get() = executor.httpClient
    val objectMapper: ObjectMapper get() = executor.objectMapper

    suspend fun <T> executeUnchecked(method: VkMethod<T>): T {
        return executor(method, token).extractSimpleResult().unwrap()
    }
}

suspend inline operator fun <T, M> VkClient<M>.invoke(method: M): T
        where M : VkMethod<T>, M : MethodRequirement = executeUnchecked(method)
