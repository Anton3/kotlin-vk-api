package name.alatushkin.api.vk.vktypes

import com.fasterxml.jackson.databind.JsonNode
import java.io.IOException

data class VkError(
    val errorCode: Int,
    val errorMsg: String,
    var requestParams: Map<String, JsonNode> = emptyMap(),
    val method: String? = null
) {
    override fun toString(): String = "$errorCode: $errorMsg"
}

class VkApiException(val vkError: VkError) : IOException(vkError.toString())
