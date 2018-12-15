package name.alatushkin.vkapi.generated.secure.objects

import name.alatushkin.vkapi.vktypes.OkResponse
import name.alatushkin.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property success Returns if successfully processed
 * @property userId User ID
 * @property date Date when access_token has been generated in Unixtime
 * @property expire Date when access_token will expire in Unixtime
 */
data class TokenChecked(
    val success: OkResponse? = null,
    val userId: Long? = null,
    val date: VkDate? = null,
    val expire: Long? = null
)
