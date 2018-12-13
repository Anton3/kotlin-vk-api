package name.alatushkin.api.vk.generated.newsfeed.objects

import name.alatushkin.api.vk.generated.groups.objects.GroupFull
import name.alatushkin.api.vk.generated.users.objects.UserFull
import name.alatushkin.api.vk.generated.wall.objects.WallpostFull

data class SearchExtendedResponse(
    val items: List<WallpostFull>? = null,
    val profiles: List<UserFull>? = null,
    val groups: List<GroupFull>? = null
)
