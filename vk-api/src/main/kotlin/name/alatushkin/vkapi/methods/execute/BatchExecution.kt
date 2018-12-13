package name.alatushkin.vkapi.methods.execute

import name.alatushkin.vkapi.client.VkClient
import name.alatushkin.vkapi.client.extractExecuteResult
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.core.VkResult
import name.alatushkin.vkapi.json.VK_OBJECT_MAPPER
import name.alatushkin.vkapi.json.toUrlParams
import name.alatushkin.vkapi.tokens.UserOrGroupMethod
import java.io.IOException

suspend fun VkClient<*>.batchUnchecked(methods: List<VkMethod<*>>): List<VkResult<*>> {
    val response = executor(makeBatchExecuteMethod(methods), token)
    return parseBatchVkScriptResponse(response.extractExecuteResult().unwrap())
}

@Suppress("UNCHECKED_CAST")
suspend inline fun <T, M> VkClient<M>.batch(methods: List<M>): List<VkResult<T>>
        where M : VkMethod<T>, M : UserOrGroupMethod =
    batchUnchecked(methods) as List<VkResult<T>>

internal fun makeBatchVkScript(methods: List<VkMethod<*>>): String {
    return methods.joinToString(", ", prefix = "return [", postfix = "];") { method ->
        val argsJson = VK_OBJECT_MAPPER.writeValueAsString(method.toUrlParams())
        "API." + method.apiMethodName + "($argsJson)"
    }
}

internal fun makeBatchExecuteMethod(methods: List<VkMethod<*>>): BatchExecuteMethod {
    return BatchExecuteMethod(
        makeBatchVkScript(
            methods
        ), methods.map { it.responseType })
}

internal fun parseBatchVkScriptResponse(response: ExecuteResponse<BatchExecuteResult>): List<VkResult<*>> {
    val results = response.response.childResults
    val errors = response.executeErrors

    var errorIndex = 0

    return results.map { result ->
        if (result != null) {
            VkResult.Success(result)
        } else {
            if (errorIndex >= errors.size) throw IOException("Some error descriptions are missing")
            VkResult.Failure<Any?>(errors[errorIndex]).also { ++errorIndex }
        }
    }
}
