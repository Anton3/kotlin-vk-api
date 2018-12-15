package name.alatushkin.vkapi.methods.execute

import name.alatushkin.vkapi.core.VkResult
import name.alatushkin.vkapi.vktypes.VkResponse
import java.io.IOException

fun <T> VkResponse<T>.extractExecuteResult(): VkResult<ExecuteResponse<T>> {
    val (response, error, executeErrors) = this

    return when {
        error != null -> VkResult.Failure(error)
        response != null -> VkResult.Success(ExecuteResponse(response, executeErrors))
        else -> throw IOException("Response does not contain `response` or `error`")
    }
}
