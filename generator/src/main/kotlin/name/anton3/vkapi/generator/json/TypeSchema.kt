package name.anton3.vkapi.generator.json

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import name.anton3.vkapi.vktypes.ValueEnum

enum class NodeType(override val value: String) : ValueEnum<String> {
    ARRAY("array"),
    BOOLEAN("boolean"),
    INTEGER("integer"),
    NUMBER("number"),
    STRING("string"),
    OBJECT("object"),
    MESSAGES_KEYBOARD("messages_keyboard")  // TODO
}

enum class StringFormat(override val value: String) : ValueEnum<String> {
    URI("uri")
}


sealed class TypeSchema(val description: String? = null)

class OneOfType(
    val type: NodeType = NodeType.OBJECT,
    val oneOf: List<TypeSchema>
) : TypeSchema()

class AllOfType(
    val type: NodeType = NodeType.OBJECT,
    val allOf: List<TypeSchema>
) : TypeSchema()

@JsonIgnoreProperties("type", "description", "enum", "minimum")
class RefType(
    val `$ref`: String,
    description: String? = null,
    @JsonProperty("invalid_one_of")
    val invalidOneOf: Boolean = false
) : TypeSchema(description = description)

class SimpleType(
    val type: NodeType,
    description: String? = null,
    val minimum: Int? = null,
    val maximum: Int? = null,
    val format: StringFormat? = null,
    val minLength: Int? = null,
    val maxLength: Int? = null
) : TypeSchema(description = description)

class SimpleMultiType(
    val type: List<NodeType>,
    description: String
) : TypeSchema(description = description)

class EnumType(
    val type: NodeType,
    description: String? = null,
    val enum: List<String>,
    val enumNames: List<String>? = null,
    val minimum: Int? = null,
    val withoutRefs: Boolean = false
) : TypeSchema(description = description)

class ArrayType(
    val type: NodeType,
    description: String? = null,
    val items: TypeSchema,
    val minItems: Int? = null,
    val maxItems: Int? = null
) : TypeSchema(description = description)

class ObjectType(
    val type: NodeType = NodeType.OBJECT,
    val properties: Map<String, TypeSchema>,
    val additionalProperties: Boolean? = false,
    val required: List<String> = emptyList(),
    val maxProperties: Int? = null,
    val minProperties: Int? = null,
    val withoutRefs: Boolean = false,
    val withSetters: Boolean = false
) : TypeSchema()

class PatternPropertiesType(
    val type: NodeType = NodeType.OBJECT,
    val patternProperties: Map<String, TypeSchema>,
    val withoutRefs: Boolean = false
) : TypeSchema()
