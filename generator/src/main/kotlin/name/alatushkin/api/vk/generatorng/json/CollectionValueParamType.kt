package name.alatushkin.api.vk.generatorng.json

data class CollectionValueParamType(
    val type: String,
    //для массивов
    val minimum: Int? = 0,
    //для строк
    val enum: List<String>? = null,
    val enumNames: List<String>? = null
)
