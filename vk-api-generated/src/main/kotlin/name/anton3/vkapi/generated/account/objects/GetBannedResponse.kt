@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.objects

import name.anton3.vkapi.generated.groups.objects.Group
import name.anton3.vkapi.generated.users.objects.UserMin

/**
 * No description
 *
 * @property count Total number
 * @property items No description
 * @property profiles No description
 * @property groups No description
 */
data class GetBannedResponse(
    val count: Int,
    val items: List<Int>,
    val profiles: List<UserMin>? = null,
    val groups: List<Group>? = null
)
