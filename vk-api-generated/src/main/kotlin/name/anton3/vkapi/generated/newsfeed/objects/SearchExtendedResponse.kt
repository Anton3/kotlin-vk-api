@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.objects

import name.anton3.vkapi.generated.groups.objects.GroupFull
import name.anton3.vkapi.generated.users.objects.UserFull
import name.anton3.vkapi.generated.wall.objects.WallpostFull

/**
 * No description
 *
 * @property items No description
 * @property profiles No description
 * @property groups No description
 * @property count Filtered number
 * @property totalCount Total number
 * @property nextFrom No description
 */
data class SearchExtendedResponse(
    val items: List<WallpostFull>? = null,
    val profiles: List<UserFull>? = null,
    val groups: List<GroupFull>? = null,
    val count: Int? = null,
    val totalCount: Int? = null,
    val nextFrom: String? = null
)
