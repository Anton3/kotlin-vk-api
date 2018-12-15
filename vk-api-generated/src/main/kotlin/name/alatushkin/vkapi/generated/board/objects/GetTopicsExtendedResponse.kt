package name.alatushkin.vkapi.generated.board.objects

import name.alatushkin.vkapi.generated.users.objects.UserMin

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
    val count: Long,
    val items: List<Topic>,
    val defaultOrder: DefaultOrder,
    val canAddTopics: Boolean,
    val profiles: List<UserMin>
)
