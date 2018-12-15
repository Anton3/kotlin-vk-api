package name.alatushkin.vkapi.generated.board.objects

import name.alatushkin.vkapi.generated.groups.objects.Group
import name.alatushkin.vkapi.generated.users.objects.User

/**
 * No description
 *
 * @property count Total number
 * @property items No description
 * @property poll No description
 * @property profiles No description
 * @property groups No description
 */
data class GetCommentsExtendedResponse(
    val count: Long,
    val items: List<TopicComment>,
    val poll: TopicPoll? = null,
    val profiles: List<User>,
    val groups: List<Group>
)
