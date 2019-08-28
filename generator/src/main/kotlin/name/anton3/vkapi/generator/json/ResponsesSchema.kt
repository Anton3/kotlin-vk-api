package name.anton3.vkapi.generator.json

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
    val response: TypeDescription
)
