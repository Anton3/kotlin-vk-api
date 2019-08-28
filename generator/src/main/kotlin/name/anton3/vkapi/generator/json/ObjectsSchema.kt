package name.anton3.vkapi.generator.json

data class ObjectsSchema(
    val `$schema`: String,
    val title: String,
    val definitions: MutableMap<String, TypeDescription>
)
