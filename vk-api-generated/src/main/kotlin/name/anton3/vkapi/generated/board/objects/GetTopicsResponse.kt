package name.anton3.vkapi.generated.board.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property count Total number
 * @property items No description
 * @property defaultOrder No description
 * @property canAddTopics Information whether current user can add topic
 */
data class GetTopicsResponse(
    val count: Int,
    val items: List<Topic>,
    val defaultOrder: DefaultOrder,
    val canAddTopics: BoolInt
)
