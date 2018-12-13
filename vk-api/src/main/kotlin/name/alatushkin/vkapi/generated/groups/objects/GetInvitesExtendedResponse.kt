package name.alatushkin.vkapi.generated.groups.objects

import name.alatushkin.vkapi.generated.users.objects.UserMin

data class GetInvitesExtendedResponse(
    val count: Long,
    val items: List<GroupXtrInvitedBy>,
    val profiles: List<UserMin>
)
