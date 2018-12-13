package name.alatushkin.vkapi.generated.newsfeed.objects

import name.alatushkin.vkapi.generated.groups.objects.GroupFull
import name.alatushkin.vkapi.generated.users.objects.UserFull
import name.alatushkin.vkapi.generated.wall.objects.WallpostFull

data class SearchExtendedResponse(
    val items: List<WallpostFull>? = null,
    val profiles: List<UserFull>? = null,
    val groups: List<GroupFull>? = null
)
