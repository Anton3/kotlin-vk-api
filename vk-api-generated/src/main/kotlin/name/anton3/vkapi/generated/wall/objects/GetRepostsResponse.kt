@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.objects

import name.anton3.vkapi.generated.groups.objects.Group
import name.anton3.vkapi.generated.users.objects.User

/**
 * No description
 *
 * @property items No description
 * @property profiles No description
 * @property groups No description
 */
data class GetRepostsResponse(
    val items: List<WallpostFull>,
    val profiles: List<User>,
    val groups: List<Group>
)
