package name.anton3.vkapi.generator.json

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonUnwrapped
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.vktypes.ValueEnum

data class Schema(
    val methods: List<MethodSchema>?,
    val errors: List<Error>?,
    val definitions: Map<String, TypeSchema>?,
    val title: String?,
    val `$schema`: String?
)

data class Patch(
    val methods: List<MethodSchema> = emptyList(),
    val responses: Map<String, ObjectType> = emptyMap(),
    val objects: Map<String, TypeSchema> = emptyMap()
)


data class Error(
    val name: String,
    val code: Int,
    val description: String
)

enum class AccessTokenType(override val value: String) : ValueEnum<String> {
    OPEN("open"),
    USER("user"),
    GROUP("group"),
    SERVICE("service")
}

@JsonDeserialize(using = SinglePolyUnwrappedDeserializer::class)
data class MethodParameterSchema(
    val name: String,
    val default: String? = null,
    val required: Boolean = false,
    @JsonUnwrapped val parameterType: TypeSchema
)

data class MethodSchema(
    val name: String,
    val description: String? = null,
    @JsonProperty("access_token_type")
    val accessTokenType: List<AccessTokenType> = emptyList(),
    val parameters: List<MethodParameterSchema> = emptyList(),
    val responses: MethodResponses,
    val errors: List<Error> = emptyList()
)
