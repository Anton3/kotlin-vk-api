package name.alatushkin.vkapi.generated.groups.objects

import name.alatushkin.vkapi.vktypes.VkDate

data class BanInfo(
    val adminId: Long? = null,
    val date: VkDate? = null,
    val reason: BanInfoReason? = null,
    val comment: String? = null,
    val endDate: Long? = null
)
