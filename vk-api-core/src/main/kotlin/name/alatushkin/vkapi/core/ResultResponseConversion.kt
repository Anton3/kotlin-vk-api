package name.alatushkin.vkapi.core

import name.alatushkin.vkapi.methods.execute.ExecuteResponse
import name.alatushkin.vkapi.vktypes.VkResponse
import java.io.IOException

fun <T> VkResponse<T>.extractSimpleResult(): VkResult<T> {
    val (response, error, _) = this

    return when {
        error != null -> VkResult.Failure(error)
        response != null -> VkResult.Success(response)
        else -> throw IOException("Response does not contain `response` or `error`")
    }
}

fun <T> VkResponse<T>.extractExecuteResult(): VkResult<ExecuteResponse<T>> {
    val (response, error, executeErrors) = this

    return when {
        error != null -> VkResult.Failure(error)
        response != null -> VkResult.Success(ExecuteResponse(response, executeErrors))
        else -> throw IOException("Response does not contain `response` or `error`")
    }
}

fun <T> VkResult<T>.wrapInSimpleResponse(): VkResponse<T> {
    return when (this) {
        is VkResult.Success -> VkResponse(response = value)
        is VkResult.Failure -> VkResponse(error = error)
    }
}

fun <T> VkResult<ExecuteResponse<T>>.wrapInExecuteResponse(): VkResponse<T> {
    return when (this) {
        is VkResult.Success -> VkResponse(response = value.response, executeErrors = value.executeErrors)
        is VkResult.Failure -> VkResponse(error = error)
    }
}
