package name.alatushkin.api.vk.generated.newsfeed.objects

import name.alatushkin.api.vk.generated.groups.objects.GroupFull
import name.alatushkin.api.vk.generated.users.objects.UserFull

data class GetBannedExtendedResponse(
    val groups: List<UserFull>? = null,
    val members: List<GroupFull>? = null
)
