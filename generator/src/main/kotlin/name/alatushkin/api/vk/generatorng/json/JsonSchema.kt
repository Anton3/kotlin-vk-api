package name.alatushkin.api.vk.generatorng.json

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import name.alatushkin.api.vk.generatorng.source.JsonTypeRef
import kotlin.reflect.KClass

class ObjectSchemaDeserializer : StdDeserializer<Object>(Object::class.java) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): Object {
        val oc = p.codec
        val node: JsonNode = oc.readTree(p)
        val subParser = node.traverse(oc)
        subParser.nextToken()

        val objectKind: KClass<out Object> = when {
            node.has("\$ref") -> RefObject::class
            node.has("oneOf") -> OneOfObject::class
            node.has("allOf") -> AllOfObject::class
            node.has("type") && node["type"].textValue() == "array" -> ArrayObject::class
            node.has("type") && node["type"].isArray -> SimpleObjectMultiType::class
            node.has("enum") -> EnumObject::class
            node.has("patternProperties") -> ObjectWithPatternProperties::class
            !node.has("properties") -> SimpleObject::class
            else -> GeneralObject::class
        }
        return ctxt.readValue(subParser, objectKind.java)
    }
}


sealed class Object(val description: String? = null, val inherited: Boolean = false)

class OneOfObject(
    val type: String = "object",
    @JsonDeserialize(contentUsing = ObjectSchemaDeserializer::class)
    val oneOf: List<Object>
) : Object()

class AllOfObject(
    val type: String = "object",
    @JsonDeserialize(contentUsing = ObjectSchemaDeserializer::class)
    val allOf: List<Object>
) : Object()

class RefObject(
    val `$ref`: String,
    description: String? = null,
    //у некоторых есть вырожденные случаи
    @Suppress("UNUSED_PARAMETER")
    type: String? = null
) : Object(description) {
    fun toJsonRef(): JsonTypeRef {
        return this.`$ref`.substringAfterLast('/')
    }
}

class SimpleObject(
    val type: String,
    description: String? = null,
    val minimum: Int? = null
) : Object(description)

class SimpleObjectMultiType(
    val type: List<String>,
    description: String
) : Object(description)

class EnumObject(
    val type: String,
    description: String? = null,
    val enum: List<String>,
    val enumNames: List<String>? = null
) : Object(description)

class ArrayObject(
    val type: String,
    description: String? = null,
    //@JsonDeserialize(using = ItemTypeDeserializer::class)
    @JsonDeserialize(using = ObjectSchemaDeserializer::class)
    val items: Object
) : Object(description)

class GeneralObject(
    val type: String = "object",
    @JsonDeserialize(contentUsing = ObjectSchemaDeserializer::class)
    val properties: Map<String, Object>,
    val additionalProperties: Boolean? = false,
    val required: List<String> = emptyList(),
    val maxProperties: Int? = null,
    val minProperties: Int? = null
) : Object()

class ObjectWithPatternProperties(
    val type: String = "object",
    @JsonDeserialize(contentUsing = ObjectSchemaDeserializer::class)
    val patternProperties: Map<String, Object>
) : Object()
