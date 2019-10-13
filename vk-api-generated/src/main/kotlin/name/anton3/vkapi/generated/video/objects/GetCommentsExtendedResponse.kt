@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.objects

import name.anton3.vkapi.generated.groups.objects.GroupFull
import name.anton3.vkapi.generated.users.objects.UserMin
import name.anton3.vkapi.generated.wall.objects.WallComment

/**
 * No description
 *
 * @property count Total number
 * @property items No description
 * @property profiles No description
 * @property groups No description
 */
data class GetCommentsExtendedResponse(
    val count: Int,
    val items: List<WallComment>,
    val profiles: List<UserMin>,
    val groups: List<GroupFull>
)
