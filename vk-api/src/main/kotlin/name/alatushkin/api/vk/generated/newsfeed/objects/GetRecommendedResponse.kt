package name.alatushkin.api.vk.generated.newsfeed.objects

import name.alatushkin.api.vk.generated.groups.objects.GroupFull
import name.alatushkin.api.vk.generated.users.objects.UserFull

data class GetRecommendedResponse(
    val items: List<NewsfeedItem>? = null,
    val profiles: List<UserFull>? = null,
    val groups: List<GroupFull>? = null,
    val newOffset: String? = null,
    val newFrom: String? = null
)
