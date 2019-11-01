package name.anton3.vkapi.generator.json

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import name.anton3.vkapi.vktypes.ValueEnum

enum class NodeType(override val value: String) : ValueEnum<String> {
    ARRAY("array"),
    BOOLEAN("boolean"),
    INTEGER("integer"),
    NUMBER("number"),
    STRING("string"),
    OBJECT("object")
}

enum class StringFormat(override val value: String) : ValueEnum<String> {
    URI("uri"),
    JSON("json")
}


sealed class TypeSchema(val description: String? = null)

class OneOfType(
    val type: NodeType = NodeType.OBJECT,
    description: String? = null,
    val oneOf: List<TypeSchema>
) : TypeSchema(description = description)

class AllOfType(
    val type: NodeType = NodeType.OBJECT,
    description: String? = null,
    val allOf: List<TypeSchema>
) : TypeSchema(description = description)

@JsonIgnoreProperties("type", "enum", "minimum", "invalid_one_of")
class RefType(
    val `$ref`: String,
    description: String? = null
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

@JsonIgnoreProperties("withoutRefs")
class EnumType(
    val type: NodeType,
    description: String? = null,
    val enum: List<String>,
    val enumNames: List<String>? = null,
    val minimum: Int? = null
) : TypeSchema(description = description)

class ArrayType(
    val type: NodeType,
    description: String? = null,
    val items: TypeSchema,
    val minItems: Int? = null,
    val maxItems: Int? = null
) : TypeSchema(description = description)

@JsonIgnoreProperties("withoutRefs", "withSetters")
class ObjectType(
    val type: NodeType = NodeType.OBJECT,
    description: String? = null,
    val properties: Map<String, TypeSchema>,
    val additionalProperties: Boolean? = false,
    val required: List<String> = emptyList(),
    val maxProperties: Int? = null,
    val minProperties: Int? = null
) : TypeSchema(description = description)

@JsonIgnoreProperties("withoutRefs")
class PatternPropertiesType(
    val type: NodeType = NodeType.OBJECT,
    description: String? = null,
    val patternProperties: Map<String, TypeSchema>
) : TypeSchema(description = description)
