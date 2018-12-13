package name.alatushkin.api.vk.generated.groups.objects

import name.alatushkin.api.vk.vktypes.VkDate

data class BanInfo(
    val adminId: Long? = null,
    val date: VkDate? = null,
    val reason: BanInfoReason? = null,
    val comment: String? = null,
    val endDate: Long? = null
)
