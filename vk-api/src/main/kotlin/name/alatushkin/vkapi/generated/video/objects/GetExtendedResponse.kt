package name.alatushkin.vkapi.generated.video.objects

import name.alatushkin.vkapi.generated.groups.objects.GroupFull
import name.alatushkin.vkapi.generated.users.objects.UserMin

data class GetExtendedResponse(
    val count: Long,
    val items: List<VideoFull>,
    val profiles: List<UserMin>,
    val groups: List<GroupFull>
)
