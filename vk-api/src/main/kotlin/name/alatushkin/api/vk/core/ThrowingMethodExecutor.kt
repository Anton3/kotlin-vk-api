package name.alatushkin.api.vk.core

import name.alatushkin.api.vk.execute.ExecuteMethod
import name.alatushkin.api.vk.execute.ExecuteResponse
import name.alatushkin.api.vk.tokens.Token
import name.alatushkin.api.vk.vktypes.VkResponse
import name.alatushkin.httpclient.HttpClient
import java.io.IOException

data class ThrowingMethodExecutor(val base: MethodExecutor) {
    suspend operator fun <T> invoke(method: VkMethod<T>, token: Token<*>): T {
        return extractSimpleResult(base(method, token)).unwrap()
    }

    suspend operator fun <T> invoke(method: ExecuteMethod<T>, token: Token<*>): ExecuteResponse<T> {
        return extractExecuteResult(base(method, token)).unwrap()
    }

    val httpClient: HttpClient get() = base.httpClient
}

fun <T> extractSimpleResult(response: VkResponse<T>): VkResult<T> {
    return when {
        response.error != null -> VkResult.Failure(response.error)
        response.response != null -> VkResult.Success(response.response)
        else -> throw IOException("Response does not contain `response` or `error`")
    }
}

fun <T> extractExecuteResult(response: VkResponse<T>): VkResult<ExecuteResponse<T>> {
    return when {
        response.error != null -> VkResult.Failure(response.error)
        response.response != null -> VkResult.Success(ExecuteResponse(response.response, response.executeErrors))
        else -> throw IOException("Response does not contain `response` or `error`")
    }
}
