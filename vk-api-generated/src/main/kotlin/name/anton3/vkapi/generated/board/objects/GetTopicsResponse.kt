package name.anton3.vkapi.generated.board.objects

/**
 * No description
 *
 * @property count Total number
 * @property items No description
 * @property defaultOrder No description
 * @property canAddTopics Information whether current user can add topic
 */
data class GetTopicsResponse(
    val count: Long,
    val items: List<Topic>,
    val defaultOrder: DefaultOrder,
    val canAddTopics: Boolean
)
