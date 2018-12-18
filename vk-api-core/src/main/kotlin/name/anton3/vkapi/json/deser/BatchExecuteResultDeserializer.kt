package name.anton3.vkapi.json.deser

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JavaType
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.node.ArrayNode
import com.fasterxml.jackson.databind.node.BooleanNode
import name.anton3.vkapi.json.forwardableAttributes
import name.anton3.vkapi.json.readNode
import name.anton3.vkapi.methods.execute.BatchExecuteResult

const val EXECUTE_RESPONSE_TYPES = "executeResponseTypes"

object BatchExecuteResultDeserializer : StdDeserializer<BatchExecuteResult>(BatchExecuteResult::class.java) {

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): BatchExecuteResult {
        val codec = p.codec as ObjectMapper
        val node = p.readNode<ArrayNode>()

        @Suppress("UNCHECKED_CAST")
        val responseTypes: List<JavaType> = ctxt.forwardableAttributes[EXECUTE_RESPONSE_TYPES] as? List<JavaType>
            ?: error("Inject `$EXECUTE_RESPONSE_TYPES` before deserialization of ${BatchExecuteResult::class.simpleName}")

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
