@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.objects

import name.anton3.vkapi.generated.groups.objects.GroupFull
import name.anton3.vkapi.generated.users.objects.UserFull

/**
 * No description
 *
 * @property items No description
 * @property profiles No description
 * @property groups No description
 * @property newOffset New offset value
 * @property nextFrom Next from value
 */
data class GetRecommendedResponse(
    val items: List<NewsfeedItem>? = null,
    val profiles: List<UserFull>? = null,
    val groups: List<GroupFull>? = null,
    val newOffset: String? = null,
    val nextFrom: String? = null
)
