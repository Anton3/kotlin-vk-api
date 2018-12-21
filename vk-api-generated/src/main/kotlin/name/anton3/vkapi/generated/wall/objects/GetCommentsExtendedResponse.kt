package name.anton3.vkapi.generated.wall.objects

import name.anton3.vkapi.generated.groups.objects.Group
import name.anton3.vkapi.generated.users.objects.User

/**
 * No description
 *
 * @property count Total number
 * @property items No description
 * @property profiles No description
 * @property groups No description
 */
data class GetCommentsExtendedResponse(
    val count: Long,
    val items: List<WallComment>,
    val profiles: List<User>,
    val groups: List<Group>
)
