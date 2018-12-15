package name.alatushkin.vkapi.methods.execute

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.json.ForwardableAttributes
import name.alatushkin.vkapi.json.deser.EXECUTE_RESPONSE_TYPES

class BatchExecuteMethod(code: String, @JsonIgnore private val responseTypes: List<TypeReference<*>>) :
    ExecuteMethod<BatchExecuteResult>(code, jacksonTypeRef()) {

    init {
        require(responseTypes.size < BATCH_EXECUTE_LIMIT) { "Batch limit exceeded: N=${responseTypes.size}" }
    }

    override val parserAttributes: ForwardableAttributes
        get() = ForwardableAttributes(EXECUTE_RESPONSE_TYPES, responseTypes)
}

const val BATCH_EXECUTE_LIMIT = 25
