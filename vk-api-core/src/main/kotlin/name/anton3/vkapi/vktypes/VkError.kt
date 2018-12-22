package name.anton3.vkapi.vktypes

import com.fasterxml.jackson.databind.JsonNode

data class VkError(
    val errorCode: Int,
    val errorMsg: String,
    val requestParams: List<MapEntry> = emptyList(),
    val method: String? = null
) {
    data class MapEntry(val key: String, val value: JsonNode)

    override fun toString(): String = "$errorCode: $errorMsg"
}
