package name.alatushkin.vkapi.generated.newsfeed.objects

import name.alatushkin.vkapi.generated.groups.objects.GroupFull
import name.alatushkin.vkapi.generated.users.objects.UserFull

data class GetBannedExtendedResponse(
    val groups: List<UserFull>? = null,
    val members: List<GroupFull>? = null
)
