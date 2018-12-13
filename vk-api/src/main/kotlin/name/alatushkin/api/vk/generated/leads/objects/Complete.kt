package name.alatushkin.api.vk.generated.leads.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt
import name.alatushkin.api.vk.generated.common.objects.OkResponse

data class Complete(
    val limit: Long? = null,
    val spent: Long? = null,
    val cost: Long? = null,
    val testMode: BoolInt? = null,
    val success: OkResponse? = null
)
