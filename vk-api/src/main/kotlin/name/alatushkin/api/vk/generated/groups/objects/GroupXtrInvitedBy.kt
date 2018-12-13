package name.alatushkin.api.vk.generated.groups.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt

data class GroupXtrInvitedBy(
    val id: String? = null,
    val name: String? = null,
    val screenName: String? = null,
    val isClosed: BoolInt? = null,
    val type: GroupXtrInvitedByType? = null,
    val isAdmin: BoolInt? = null,
    val adminLevel: GroupXtrInvitedByAdminLevel? = null,
    val isMember: BoolInt? = null,
    val photo50: String? = null,
    val photo100: String? = null,
    val photo200: String? = null,
    val invitedBy: Long? = null
)
