package name.anton3.vkapi.generated.secure.objects

import name.anton3.vkapi.vktypes.OkResponse
import name.anton3.vkapi.vktypes.VkDate

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
    val userId: Int? = null,
    val date: VkDate? = null,
    val expire: Int? = null
)
