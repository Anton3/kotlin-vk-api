package name.alatushkin.api.vk.generated.groups.objects

import name.alatushkin.api.vk.generated.users.objects.UserMin

data class GetInvitesExtendedResponse(
    val count: Long,
    val items: List<GroupXtrInvitedBy>,
    val profiles: List<UserMin>
)
