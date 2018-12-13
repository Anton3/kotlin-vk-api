package name.alatushkin.api.vk.generated.video.objects

import name.alatushkin.api.vk.generated.groups.objects.GroupFull
import name.alatushkin.api.vk.generated.users.objects.UserMin

data class GetExtendedResponse(
    val count: Long,
    val items: List<VideoFull>,
    val profiles: List<UserMin>,
    val groups: List<GroupFull>
)
