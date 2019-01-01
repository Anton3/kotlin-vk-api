package name.anton3.vkapi.generated.board.objects

import name.anton3.vkapi.generated.groups.objects.Group
import name.anton3.vkapi.generated.users.objects.User

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
    val count: Int,
    val items: List<TopicComment>,
    val poll: TopicPoll? = null,
    val profiles: List<User>,
    val groups: List<Group>
)
