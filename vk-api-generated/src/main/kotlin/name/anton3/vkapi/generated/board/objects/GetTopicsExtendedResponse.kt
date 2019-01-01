package name.anton3.vkapi.generated.board.objects

import name.anton3.vkapi.generated.users.objects.UserMin

/**
 * No description
 *
 * @property count Total number
 * @property items No description
 * @property defaultOrder No description
 * @property canAddTopics Information whether current user can add topic
 * @property profiles No description
 */
data class GetTopicsExtendedResponse(
    val count: Int,
    val items: List<Topic>,
    val defaultOrder: DefaultOrder,
    val canAddTopics: Boolean,
    val profiles: List<UserMin>
)
