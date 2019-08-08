package name.anton3.vkapi.vktypes

data class VkResponse<T>(
    val response: T? = null,
    val error: VkError? = null,
    val executeErrors: List<VkError> = emptyList()
)
