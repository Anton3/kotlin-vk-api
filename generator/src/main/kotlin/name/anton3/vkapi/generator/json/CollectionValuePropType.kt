package name.anton3.vkapi.generator.json

data class CollectionValuePropType(
    val `$ref`: String? = null,
    //или
    val type: String? = null,
    val description: String? = null,
    val enum: List<String>? = null,
    val minimum: Int? = null
)
