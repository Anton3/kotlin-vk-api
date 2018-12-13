package name.alatushkin.vkapi.generated.secure.objects

import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.vktypes.VkDate

data class TokenChecked(
    val success: OkResponse? = null,
    val userId: Long? = null,
    val date: VkDate? = null,
    val expire: Long? = null
)
