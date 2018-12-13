package name.alatushkin.api.vk.generated.leads.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt
import name.alatushkin.api.vk.vktypes.VkDate

data class Entry(
    val uid: Long? = null,
    val aid: Long? = null,
    val sid: String? = null,
    val date: VkDate? = null,
    val status: Long? = null,
    val testMode: BoolInt? = null,
    val startDate: Long? = null,
    val comment: String? = null
)
