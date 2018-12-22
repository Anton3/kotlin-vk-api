package name.anton3.vkapi.vktypes

import com.fasterxml.jackson.databind.JsonNode

data class VkError(
    val errorCode: Int,
    val errorMsg: String,
    var requestParams: Map<String, JsonNode> = emptyMap(),
    val method: String? = null
) {
    override fun toString(): String = "$errorCode: $errorMsg"
}
