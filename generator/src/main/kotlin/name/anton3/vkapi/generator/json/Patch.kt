package name.anton3.vkapi.generator.json

data class Patch(
    val methods: List<MethodSchema> = emptyList(),
    val responses: Map<String, ResponseDefinitionSchema> = emptyMap(),
    val objects: Map<String, TypeDescription> = emptyMap()
)
