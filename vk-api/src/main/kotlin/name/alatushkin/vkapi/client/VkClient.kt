package name.alatushkin.vkapi.client

import name.alatushkin.vkapi.executors.MethodExecutor
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.MethodRequirement
import name.alatushkin.vkapi.tokens.Token
import name.alatushkin.httpclient.HttpClient

data class VkClient<in M: MethodRequirement>(val executor: MethodExecutor, val token: Token<M>) {
    val httpClient: HttpClient get() = executor.httpClient

    suspend fun <T> executeUnchecked(method: VkMethod<T>): T {
        return executor(method, token).extractSimpleResult().unwrap()
    }
}

suspend inline operator fun <T, M> VkClient<M>.invoke(method: M): T
        where M : VkMethod<T>, M : MethodRequirement =
    executeUnchecked(method)

fun <M : MethodRequirement> MethodExecutor.withToken(token: Token<M>): VkClient<M> =
    VkClient(this, token)
