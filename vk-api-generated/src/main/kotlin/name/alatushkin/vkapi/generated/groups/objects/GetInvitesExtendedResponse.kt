package name.alatushkin.vkapi.generated.groups.objects

import name.alatushkin.vkapi.generated.users.objects.UserMin

/**
 * No description
 *
 * @property count Total communities number
 * @property items No description
 * @property profiles No description
 */
data class GetInvitesExtendedResponse(
    val count: Long,
    val items: List<GroupXtrInvitedBy>,
    val profiles: List<UserMin>
)
