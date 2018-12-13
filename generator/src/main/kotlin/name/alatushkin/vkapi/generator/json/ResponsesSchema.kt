package name.alatushkin.vkapi.generator.json

import com.fasterxml.jackson.databind.annotation.JsonDeserialize


data class ResponsesSchema(
    val `$schema`: String,
    val title: String,
    val definitions: MutableMap<String, ResponseDefinitionSchema>
)

data class ResponseDefinitionSchema(
    val type: String? = null,
    val properties: ResponseObjectDefinition,
    val additionalProperties: Boolean? = false,
    val minProperties: Int? = null,
    val required: List<String> = emptyList()
)

data class ResponseObjectDefinition(
    @JsonDeserialize(using = ObjectSchemaDeserializer::class)
    val response: Object? = null
)
