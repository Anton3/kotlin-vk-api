package name.anton3.vkapi.json.deserializers

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.node.ObjectNode
import com.fasterxml.jackson.databind.ser.std.StdSerializer
import name.anton3.vkapi.json.core.readNode
import name.anton3.vkapi.json.core.strongType
import name.anton3.vkapi.methods.longpoll.attachments.Attachment

@JsonIgnoreProperties(ignoreUnknown = true)
internal abstract class LongPollAttachmentsMixin {

    @get:JsonDeserialize(using = AttachmentsDeserializer::class)
    @get:JsonSerialize(using = AttachmentsSerializer::class)
    abstract val attachments: List<Attachment>
}

internal class AttachmentsDeserializer : StdDeserializer<List<Attachment>>(strongType<List<Attachment>>()) {

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): List<Attachment> {
        val objectMapper = p.codec as ObjectMapper

        val node = p.readNode<ObjectNode>()

        return node.fields()
            .asSequence()
            .filter { it.key.startsWith("attach") }
            .groupBy { it.key.substring(6, 7).toInt() }
            .values
            .map { properties ->
                val strippedProperties = properties.associate { (key, value) ->
                    val strippedKey = if (key.length == 7) {
                        "id"
                    } else {
                        key.substring(8)
                    }

                    strippedKey to value
                }

                objectMapper.convertValue(strippedProperties, Attachment::class.java)
            }
    }
}

internal class AttachmentsSerializer : StdSerializer<List<Attachment>>(strongType<List<Attachment>>()) {

    override fun serialize(value: List<Attachment>, gen: JsonGenerator, provider: SerializerProvider) {
        val objectMapper = gen.codec as ObjectMapper
        gen.writeStartObject()

        for ((index, attachment) in value.withIndex()) {
            val node = objectMapper.valueToTree<ObjectNode>(attachment)

            for ((propertyName, propertyValue) in node.fields()) {
                val fullName = if (propertyName == "id") {
                    "attach${index + 1}"
                } else {
                    "attach${index + 1}_$propertyName"
                }

                gen.writeObjectField(fullName, propertyValue)
            }
        }

        gen.writeEndObject()
    }
}
