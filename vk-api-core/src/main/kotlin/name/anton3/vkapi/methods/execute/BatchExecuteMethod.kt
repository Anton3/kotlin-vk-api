package name.anton3.vkapi.methods.execute

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.json.core.serializeMethod
import name.anton3.vkapi.method.VkMethod

class BatchExecuteMethod(@JsonIgnore val methods: List<VkMethod<*>>, objectMapper: ObjectMapper) :
    ExecuteMethod<BatchExecuteResult>(makeBatchVkScript(methods, objectMapper), jacksonTypeRef())

// TODO Resolve cyclic dependency on `name.anton3.vkapi.json` package (serializeMethod)
private fun makeBatchVkScript(methods: List<VkMethod<*>>, objectMapper: ObjectMapper): String {
    return methods.joinToString(", ", prefix = "return [", postfix = "];") { method ->
        val argsJson = objectMapper.writeValueAsString(objectMapper.serializeMethod(method))
        "API." + method.apiMethodName + "($argsJson)"
    }
}
