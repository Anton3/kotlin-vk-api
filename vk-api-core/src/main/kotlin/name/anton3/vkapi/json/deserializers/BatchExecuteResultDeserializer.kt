package name.anton3.vkapi.json.deserializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.node.ArrayNode
import com.fasterxml.jackson.databind.node.BooleanNode
import name.anton3.vkapi.json.attributes.forwardableAttributes
import name.anton3.vkapi.json.core.METHOD_ATTRIBUTE
import name.anton3.vkapi.json.core.readNode
import name.anton3.vkapi.methods.execute.BatchExecuteMethod
import name.anton3.vkapi.methods.execute.BatchExecuteResult

internal object BatchExecuteResultDeserializer : StdDeserializer<BatchExecuteResult>(BatchExecuteResult::class.java) {

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): BatchExecuteResult {
        val codec = p.codec
        val node = p.readNode<ArrayNode>()

        val method: BatchExecuteMethod = ctxt.forwardableAttributes[METHOD_ATTRIBUTE] as? BatchExecuteMethod
            ?: error("Inject `$METHOD_ATTRIBUTE` before deserialization of ${BatchExecuteResult::class.simpleName}")

        return BatchExecuteResult(
            node.zip(method.methods) { child, childMethod ->
                if (child is BooleanNode && !child.booleanValue()) {
                    null
                } else {
                    val responseType = ctxt.typeFactory.constructType(childMethod.responseType)
                    codec.readValue<Any?>(child.traverse(codec), responseType)
                }
            }
        )
    }
}
