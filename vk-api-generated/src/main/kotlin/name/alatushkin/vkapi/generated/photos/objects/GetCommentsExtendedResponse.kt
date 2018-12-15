package name.alatushkin.vkapi.generated.photos.objects

import name.alatushkin.vkapi.generated.groups.objects.GroupFull
import name.alatushkin.vkapi.generated.users.objects.UserFull
import name.alatushkin.vkapi.generated.wall.objects.WallComment

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
    val count: Long,
    val realOffset: Long? = null,
    val items: List<WallComment>,
    val profiles: List<UserFull>,
    val groups: List<GroupFull>
)
