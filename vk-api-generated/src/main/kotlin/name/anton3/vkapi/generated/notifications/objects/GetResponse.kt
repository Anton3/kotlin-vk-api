@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.notifications.objects

import name.anton3.vkapi.generated.groups.objects.Group
import name.anton3.vkapi.generated.users.objects.User

/**
 * No description
 *
 * @property count Total number
 * @property items No description
 * @property profiles No description
 * @property groups No description
 * @property lastViewed Time when user has been checked notifications last time
 */
data class GetResponse(
    val count: Int? = null,
    val items: List<Notification>? = null,
    val profiles: List<User>? = null,
    val groups: List<Group>? = null,
    val lastViewed: Int? = null
)
