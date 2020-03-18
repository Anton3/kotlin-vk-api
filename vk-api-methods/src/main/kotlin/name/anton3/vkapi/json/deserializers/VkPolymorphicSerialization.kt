package name.anton3.vkapi.json.deserializers

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.jsontype.NamedType
import com.fasterxml.jackson.databind.node.ObjectNode
import com.fasterxml.jackson.databind.node.TextNode
import com.fasterxml.jackson.databind.ser.std.StdSerializer
import name.anton3.vkapi.json.core.readNode
import name.anton3.vkapi.json.core.weakType
import kotlin.reflect.full.memberProperties
import kotlin.reflect.full.primaryConstructor

inline fun <reified Attachment : Any, reified Body : Any> vkPolymorphicDeserializer(
    attachmentTypes: List<NamedType>
): StdDeserializer<Attachment> {
    val constructor = Attachment::class.primaryConstructor!!
    val typeToClass = attachmentTypes.associate { it.name!! to it.type!! }

    return object : StdDeserializer<Attachment>(weakType<Attachment>()) {
        override fun deserialize(p: JsonParser, ctxt: DeserializationContext): Attachment {
            val codec = p.codec as ObjectMapper
            val node = p.readNode<ObjectNode>()

            val type = node["type"]?.asText() ?: error("No `type` field")
            val bodyNode = if (type in TYPES_WITHOUT_UNWRAPPING) node else node[type] as ObjectNode

            val klass = typeToClass[type]

            val body = if (klass != null) {
                codec.treeToValue(bodyNode, klass)
            } else {
                UnknownCallbackAttachment(bodyNode)
            }

            return constructor.call(type, body as Body)
        }
    }
}

inline fun <reified Attachment : Any, reified Body : Any> vkPolymorphicSerializer(): StdSerializer<Attachment> {
    val typeProperty = Attachment::class.memberProperties.first { it.name == "type" }
    val bodyProperty = Attachment::class.memberProperties.first { it.name == "body" }

    return object : StdSerializer<Attachment>(weakType<Attachment>()) {
        override fun serialize(value: Attachment, gen: JsonGenerator, provider: SerializerProvider) {
            val codec = gen.codec as ObjectMapper

            val type = typeProperty.get(value) as String
            val body = bodyProperty.get(value) as Body

            val bodyNode = codec.valueToTree<ObjectNode>(body)

            val resultNode = if (type in TYPES_WITHOUT_UNWRAPPING) {
                bodyNode.put("type", type)
            } else {
                ObjectNode(codec.nodeFactory, mapOf("type" to TextNode(type), type to bodyNode))
            }

            return codec.writeTree(gen, resultNode)
        }
    }
}


val TYPES_WITHOUT_UNWRAPPING: Set<String> = setOf("photos_list")
