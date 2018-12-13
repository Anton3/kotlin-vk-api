package name.alatushkin.api.vk.generated.video.objects

import name.alatushkin.api.vk.generated.groups.objects.GroupFull
import name.alatushkin.api.vk.generated.users.objects.UserMin
import name.alatushkin.api.vk.generated.wall.objects.WallComment

data class GetCommentsResponse(
    val count: Long,
    val items: List<WallComment>,
    val profiles: List<UserMin>,
    val groups: List<GroupFull>
)
