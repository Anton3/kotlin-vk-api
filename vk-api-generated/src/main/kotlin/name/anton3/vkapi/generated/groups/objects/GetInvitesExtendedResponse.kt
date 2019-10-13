@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.generated.users.objects.UserMin

/**
 * No description
 *
 * @property count Total communities number
 * @property items No description
 * @property profiles No description
 * @property groups No description
 */
data class GetInvitesExtendedResponse(
    val count: Int,
    val items: List<GroupXtrInvitedBy>,
    val profiles: List<UserMin>,
    val groups: List<GroupFull>
)
