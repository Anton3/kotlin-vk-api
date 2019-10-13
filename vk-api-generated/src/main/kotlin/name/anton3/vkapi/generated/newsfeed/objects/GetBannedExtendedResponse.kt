@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.objects

import name.anton3.vkapi.generated.groups.objects.GroupFull
import name.anton3.vkapi.generated.users.objects.UserFull

/**
 * No description
 *
 * @property groups No description
 * @property profiles No description
 */
data class GetBannedExtendedResponse(
    val groups: List<UserFull>? = null,
    val profiles: List<GroupFull>? = null
)
