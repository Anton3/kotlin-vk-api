package name.anton3.vkapi.generated.stories.objects

import name.anton3.vkapi.generated.groups.objects.GroupFull
import name.anton3.vkapi.generated.users.objects.UserFull

/**
 * No description
 *
 * @property count Stories count
 * @property items No description
 * @property profiles No description
 * @property groups No description
 */
data class GetRepliesExtendedResponse(
    val count: Int,
    val items: List<List<Story>>,
    val profiles: List<UserFull>,
    val groups: List<GroupFull>
)
