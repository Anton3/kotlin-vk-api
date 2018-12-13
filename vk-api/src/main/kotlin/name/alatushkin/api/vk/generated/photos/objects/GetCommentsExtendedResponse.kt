package name.alatushkin.api.vk.generated.photos.objects

import name.alatushkin.api.vk.generated.groups.objects.GroupFull
import name.alatushkin.api.vk.generated.users.objects.UserFull
import name.alatushkin.api.vk.generated.wall.objects.WallComment

data class GetCommentsExtendedResponse(
    val count: Long,
    val realOffset: Long? = null,
    val items: List<WallComment>,
    val profiles: List<UserFull>,
    val groups: List<GroupFull>
)
