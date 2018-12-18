package name.anton3.vkapi.generator.json

import com.fasterxml.jackson.databind.annotation.JsonDeserialize

data class Patch(
    val methods: List<MethodSchema> = emptyList(),
    val responses: Map<String, ResponseDefinitionSchema> = emptyMap(),
    @JsonDeserialize(contentUsing = ObjectSchemaDeserializer::class)
    val objects: Map<String, Object> = emptyMap()
)
