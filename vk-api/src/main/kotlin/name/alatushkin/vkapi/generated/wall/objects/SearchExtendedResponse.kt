package name.alatushkin.vkapi.generated.wall.objects

import name.alatushkin.vkapi.generated.groups.objects.GroupFull
import name.alatushkin.vkapi.generated.users.objects.UserFull

data class SearchExtendedResponse(
    val count: Long,
    val items: List<WallpostFull>,
    val profiles: List<UserFull>,
    val groups: List<GroupFull>
)
