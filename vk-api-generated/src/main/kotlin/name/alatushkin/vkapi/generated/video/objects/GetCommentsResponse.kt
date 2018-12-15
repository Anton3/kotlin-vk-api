package name.alatushkin.vkapi.generated.video.objects

import name.alatushkin.vkapi.generated.groups.objects.GroupFull
import name.alatushkin.vkapi.generated.users.objects.UserMin
import name.alatushkin.vkapi.generated.wall.objects.WallComment

/**
 * No description
 *
 * @property count Total number
 * @property items No description
 * @property profiles No description
 * @property groups No description
 */
data class GetCommentsResponse(
    val count: Long,
    val items: List<WallComment>,
    val profiles: List<UserMin>,
    val groups: List<GroupFull>
)
