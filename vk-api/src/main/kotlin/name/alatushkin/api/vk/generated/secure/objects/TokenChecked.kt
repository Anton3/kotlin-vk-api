package name.alatushkin.api.vk.generated.secure.objects

import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.vktypes.VkDate

data class TokenChecked(
    val success: OkResponse? = null,
    val userId: Long? = null,
    val date: VkDate? = null,
    val expire: Long? = null
)
