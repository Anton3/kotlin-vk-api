package name.alatushkin.vkapi.generator.json

data class MethodParameter(
    val type: String,
    val name: String,
    val minimum: String? = null,
    val maximum: String? = null,
    val default: String? = null,
    val required: Boolean? = null,
    val description: String? = null,

    val minLength: Int? = null,
    val maxLength: Int? = null,

    //для типа array. может через наследование?
    val items: CollectionValueParamType? = null,
    val maxItems: Int? = null,

    //для enum но с типом string
    val enum: List<String>? = null,
    val enumNames: List<String>? = null
) {
    fun narrowEnumValues(values: List<String>): MethodParameter {
        val valuesToStay = values
            .map { enum!!.indexOf(it) }
            .map { enum!![it] to enumNames!![it] }
        return copy(
            enum = valuesToStay.map { it.first },
            enumNames = valuesToStay.map { it.second }
        )
    }
}
