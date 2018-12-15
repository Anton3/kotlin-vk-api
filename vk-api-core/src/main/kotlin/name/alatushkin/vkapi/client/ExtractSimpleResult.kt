package name.alatushkin.vkapi.client

import name.alatushkin.vkapi.core.VkResult
import name.alatushkin.vkapi.vktypes.VkResponse
import java.io.IOException

// See also: name.alatushkin.vkapi.methods.execute.extractExecuteResult
fun <T> VkResponse<T>.extractSimpleResult(): VkResult<T> {
    val (response, error, _) = this

    return when {
        error != null -> VkResult.Failure(error)
        response != null -> VkResult.Success(response)
        else -> throw IOException("Response does not contain `response` or `error`")
    }
}
