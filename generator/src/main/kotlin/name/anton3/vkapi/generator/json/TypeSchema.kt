package name.anton3.vkapi.generator.json

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


sealed class TypeSchema(val description: String? = null)

class OneOfType(
    val type: NodeType = NodeType.OBJECT,
    val oneOf: List<TypeSchema>
) : TypeSchema()

class AllOfType(
    val type: NodeType = NodeType.OBJECT,
    val allOf: List<TypeSchema>
) : TypeSchema()

class RefType(
    val `$ref`: String,
    description: String? = null,
    val type: NodeType? = null
) : TypeSchema(description)

class SimpleType(
    val type: NodeType,
    description: String? = null,
    val minimum: Int? = null,
    val maximum: Int? = null,
    val minLength: Int? = null,
    val maxLength: Int? = null
) : TypeSchema(description)

class SimpleMultiType(
    val type: List<NodeType>,
    description: String
) : TypeSchema(description)

class EnumType(
    val type: NodeType,
    description: String? = null,
    val enum: List<String>,
    val enumNames: List<String>? = null,
    val minimum: Int? = null  // TODO
) : TypeSchema(description)

class ArrayType(
    val type: NodeType,
    description: String? = null,
    val items: TypeSchema,
    val minItems: Int? = null,
    val maxItems: Int? = null
) : TypeSchema(description)

class ObjectType(
    val type: NodeType = NodeType.OBJECT,
    val properties: Map<String, TypeSchema>,
    val additionalProperties: Boolean? = false,
    val required: List<String> = emptyList(),
    val maxProperties: Int? = null,
    val minProperties: Int? = null
) : TypeSchema()

class PatternPropertiesType(
    val type: NodeType = NodeType.OBJECT,
    val patternProperties: Map<String, TypeSchema>
) : TypeSchema()
