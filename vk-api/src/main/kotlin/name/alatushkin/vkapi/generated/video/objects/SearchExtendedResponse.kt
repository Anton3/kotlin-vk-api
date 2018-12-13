package name.alatushkin.vkapi.generated.video.objects

import name.alatushkin.vkapi.generated.groups.objects.GroupFull
import name.alatushkin.vkapi.generated.users.objects.UserMin

data class SearchExtendedResponse(
    val count: Long,
    val items: List<Video>,
    val profiles: List<UserMin>,
    val groups: List<GroupFull>
)
