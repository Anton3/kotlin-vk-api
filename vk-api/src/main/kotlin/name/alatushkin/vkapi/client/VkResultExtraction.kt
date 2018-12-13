package name.alatushkin.vkapi.client

import name.alatushkin.vkapi.core.VkResult
import name.alatushkin.vkapi.methods.execute.ExecuteResponse
import name.alatushkin.vkapi.vktypes.VkResponse
import java.io.IOException

fun <T> VkResponse<T>.extractSimpleResult(): VkResult<T> {
    return when {
        error != null -> VkResult.Failure(error)
        response != null -> VkResult.Success(response)
        else -> throw IOException("Response does not contain `response` or `error`")
    }
}

fun <T> VkResponse<T>.extractExecuteResult(): VkResult<ExecuteResponse<T>> {
    return when {
        error != null -> VkResult.Failure(error)
        response != null -> VkResult.Success(
            ExecuteResponse(
                response,
                executeErrors
            )
        )
        else -> throw IOException("Response does not contain `response` or `error`")
    }
}
