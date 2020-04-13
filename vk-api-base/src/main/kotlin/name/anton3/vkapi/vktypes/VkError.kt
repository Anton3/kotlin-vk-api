package name.anton3.vkapi.vktypes

data class VkError(
    val errorCode: Int,
    val errorMsg: String,
    val requestParams: List<MapEntry> = emptyList(),
    val method: String? = null,
    val errorText: String? = null,
    val captchaSid: String? = null,
    val captchaImg: String? = null,
    val confirmationText: String? = null
) {
    data class MapEntry(val key: String, val value: String)

    override fun toString(): String = "$errorCode: $errorMsg"
}
