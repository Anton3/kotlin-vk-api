package name.anton3.vkapi.methods.execute

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.core.supportsBatch
import name.anton3.vkapi.json.serializeMethod

class BatchExecuteMethod(@JsonIgnore val methods: List<VkMethod<*>>, objectMapper: ObjectMapper) :
    ExecuteMethod<BatchExecuteResult>(makeBatchVkScript(methods, objectMapper), jacksonTypeRef()) {

    init {
        assert(methods.all { it.supportsBatch() })
    }
}

// TODO Resolve cyclic dependency on `name.anton3.vkapi.json` package (serializeMethod)
private fun makeBatchVkScript(methods: List<VkMethod<*>>, objectMapper: ObjectMapper): String {
    return methods.joinToString(", ", prefix = "return [", postfix = "];") { method ->
        val argsJson = objectMapper.writeValueAsString(objectMapper.serializeMethod(method))
        "API." + method.apiMethodName + "($argsJson)"
    }
}
