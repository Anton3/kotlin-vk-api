package name.anton3.vkapi.generated.wall.objects

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
data class SearchExtendedResponse(
    val count: Long,
    val items: List<WallpostFull>,
    val profiles: List<UserFull>,
    val groups: List<GroupFull>
)
