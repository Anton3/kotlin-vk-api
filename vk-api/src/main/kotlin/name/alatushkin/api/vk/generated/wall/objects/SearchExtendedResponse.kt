package name.alatushkin.api.vk.generated.wall.objects

import name.alatushkin.api.vk.generated.groups.objects.GroupFull
import name.alatushkin.api.vk.generated.users.objects.UserFull

data class SearchExtendedResponse(
    val count: Long,
    val items: List<WallpostFull>,
    val profiles: List<UserFull>,
    val groups: List<GroupFull>
)
