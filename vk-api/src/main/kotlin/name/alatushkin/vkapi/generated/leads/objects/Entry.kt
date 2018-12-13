package name.alatushkin.vkapi.generated.leads.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt
import name.alatushkin.vkapi.vktypes.VkDate

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
