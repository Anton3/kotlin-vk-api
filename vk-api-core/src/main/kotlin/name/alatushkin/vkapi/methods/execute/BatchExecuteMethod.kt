package name.alatushkin.vkapi.methods.execute

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.json.ForwardableAttributes
import name.alatushkin.vkapi.json.deser.EXECUTE_RESPONSE_TYPES
import name.alatushkin.vkapi.json.serializeMethod

class BatchExecuteMethod(code: String, @JsonIgnore private val responseTypes: List<TypeReference<*>>) :
    ExecuteMethod<BatchExecuteResult>(code, jacksonTypeRef()) {

    constructor(methods: List<VkMethod<*>>, objectMapper: ObjectMapper) :
            this(makeBatchVkScript(methods, objectMapper), methods.map { it.responseType }) {
        require(methods.all { it.supportsBatch() })
    }

    init {
        require(responseTypes.size <= BATCH_EXECUTE_LIMIT) { "Batch limit exceeded: N=${responseTypes.size}" }
    }

    override val parserAttributes: ForwardableAttributes
        @JsonIgnore get() = ForwardableAttributes(EXECUTE_RESPONSE_TYPES, responseTypes)
}

const val BATCH_EXECUTE_LIMIT = 25

private fun makeBatchVkScript(methods: List<VkMethod<*>>, objectMapper: ObjectMapper): String {
    return methods.joinToString(", ", prefix = "return [", postfix = "];") { method ->
        val argsJson = objectMapper.writeValueAsString(objectMapper.serializeMethod(method))
        "API." + method.apiMethodName + "($argsJson)"
    }
}
