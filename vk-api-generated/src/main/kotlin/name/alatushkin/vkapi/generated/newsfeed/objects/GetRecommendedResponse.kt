package name.alatushkin.vkapi.generated.newsfeed.objects

import name.alatushkin.vkapi.generated.groups.objects.GroupFull
import name.alatushkin.vkapi.generated.users.objects.UserFull

/**
 * No description
 *
 * @property items No description
 * @property profiles No description
 * @property groups No description
 * @property newOffset New offset value
 * @property newFrom New from value
 */
data class GetRecommendedResponse(
    val items: List<NewsfeedItem>? = null,
    val profiles: List<UserFull>? = null,
    val groups: List<GroupFull>? = null,
    val newOffset: String? = null,
    val newFrom: String? = null
)
