@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.objects

import name.anton3.vkapi.generated.groups.objects.GroupFull
import name.anton3.vkapi.generated.users.objects.UserFull
import name.anton3.vkapi.generated.wall.objects.WallComment

/**
 * No description
 *
 * @property count Total number
 * @property realOffset Real offset of the comments
 * @property items No description
 * @property profiles No description
 * @property groups No description
 */
data class GetCommentsExtendedResponse(
    val count: Int,
    val realOffset: Int? = null,
    val items: List<WallComment>,
    val profiles: List<UserFull>,
    val groups: List<GroupFull>
)
