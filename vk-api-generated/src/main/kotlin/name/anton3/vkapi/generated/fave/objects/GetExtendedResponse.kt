@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.objects

import name.anton3.vkapi.generated.groups.objects.Group
import name.anton3.vkapi.generated.users.objects.UserFull

/**
 * No description
 *
 * @property count Total number
 * @property items No description
 * @property profiles No description
 * @property groups No description
 */
data class GetExtendedResponse(
    val count: Int? = null,
    val items: List<Bookmark>? = null,
    val profiles: List<UserFull>? = null,
    val groups: List<Group>? = null
)
