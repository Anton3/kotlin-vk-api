package name.alatushkin.api.vk.json.deser

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JavaType
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.node.ArrayNode
import com.fasterxml.jackson.databind.node.BooleanNode
import name.alatushkin.api.vk.execute.BatchExecuteResult
import name.alatushkin.api.vk.json.desersupport.forwardableAttributes
import name.alatushkin.api.vk.json.desersupport.readNode

const val EXECUTE_RESPONSE_TYPES = "executeResponseTypes"

class BatchExecuteResultDeserializer : StdDeserializer<BatchExecuteResult>(BatchExecuteResult::class.java) {

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): BatchExecuteResult {
        val codec = p.codec as ObjectMapper
        val node = p.readNode<ArrayNode>()

        @Suppress("UNCHECKED_CAST")
        val responseTypes: List<JavaType> = ctxt.forwardableAttributes[EXECUTE_RESPONSE_TYPES] as? List<JavaType>
            ?: throw error("Inject `$EXECUTE_RESPONSE_TYPES` before deserialization of ${BatchExecuteResult::class.simpleName}")

        return BatchExecuteResult(
            node.zip(responseTypes) { child, methodType ->
                if (child is BooleanNode && !child.booleanValue()) {
                    null
                } else {
                    codec.readValue<Any?>(child.traverse(codec), methodType)
                }
            }
        )
    }
}
