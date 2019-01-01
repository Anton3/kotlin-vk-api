package name.anton3.vkapi.generated.board.objects

/**
 * No description
 *
 * @property count Total number
 * @property items No description
 * @property poll No description
 */
data class GetCommentsResponse(
    val count: Int,
    val items: List<TopicComment>,
    val poll: TopicPoll? = null
)
