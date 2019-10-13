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
 * @property nextFrom New from value
 */
data class GetCommentsResponse(
    val items: List<NewsfeedItem>,
    val profiles: List<UserFull>,
    val groups: List<GroupFull>,
    val nextFrom: String? = null
)
