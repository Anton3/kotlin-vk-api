package name.anton3.vkapi.generator.json

import name.anton3.vkapi.generator.source.JsonTypeRef

sealed class TypeDescription(val description: String? = null, val inherited: Boolean = false)

class OneOfObject(
    val type: String = "object",
    val oneOf: List<TypeDescription>
) : TypeDescription()

class AllOfObject(
    val type: String = "object",
    val allOf: List<TypeDescription>
) : TypeDescription()

class RefObject(
    val `$ref`: String,
    description: String? = null,
    @Suppress("UNUSED_PARAMETER")
    type: String? = null
) : TypeDescription(description) {

    fun toJsonRef(): JsonTypeRef {
        return `$ref`.substringAfterLast('/')
    }
}

class SimpleObject(
    val type: String,
    description: String? = null,
    val minimum: Int? = null
) : TypeDescription(description)

class SimpleObjectMultiType(
    val type: List<String>,
    description: String
) : TypeDescription(description)

class EnumObject(
    val type: String,
    description: String? = null,
    val enum: List<String>,
    val enumNames: List<String>? = null
) : TypeDescription(description)

class ArrayObject(
    val type: String,
    description: String? = null,
    val items: TypeDescription
) : TypeDescription(description)

class GeneralObject(
    val type: String = "object",
    val properties: Map<String, TypeDescription>,
    val additionalProperties: Boolean? = false,
    val required: List<String> = emptyList(),
    val maxProperties: Int? = null,
    val minProperties: Int? = null
) : TypeDescription()

class ObjectWithPatternProperties(
    val type: String = "object",
    val patternProperties: Map<String, TypeDescription>
) : TypeDescription()
