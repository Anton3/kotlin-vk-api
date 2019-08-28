@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.objects

import name.anton3.vkapi.generated.groups.objects.GroupFull
import name.anton3.vkapi.generated.users.objects.UserFull

/**
 * No description
 *
 * @property groups No description
 * @property members No description
 */
data class GetBannedExtendedResponse(
    val groups: List<UserFull>? = null,
    val members: List<GroupFull>? = null
)
