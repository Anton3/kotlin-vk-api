@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.objects

import name.anton3.vkapi.generated.groups.objects.GroupFull
import name.anton3.vkapi.generated.users.objects.UserFull

/**
 * No description
 *
 * @property description Some info about user or group
 * @property group No description
 * @property tags No description
 * @property type No description
 * @property updatedDate Timestamp, when this page was bookmarked
 * @property user No description
 */
data class Page(
    val description: String,
    val group: GroupFull? = null,
    val tags: List<Tag>,
    val type: PageType,
    val updatedDate: Int? = null,
    val user: UserFull? = null
)
