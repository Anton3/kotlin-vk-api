package name.anton3.vkapi.generated.messages.objects

import name.anton3.vkapi.generated.groups.objects.GroupFull
import name.anton3.vkapi.generated.users.objects.UserFull

/**
 * No description
 *
 * @property count Total number
 * @property items No description
 * @property profiles No description
 * @property groups No description
 */
data class GetHistoryResponse(
    val count: Int,
    val items: List<Message>,
    val profiles: List<UserFull>? = null,
    val groups: List<GroupFull>? = null
)
