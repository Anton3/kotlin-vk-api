@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.secure.objects

import name.anton3.vkapi.vktypes.OkResponse
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property date Date when access_token has been generated in Unixtime
 * @property expire Date when access_token will expire in Unixtime
 * @property success No description
 * @property userId User ID
 */
data class TokenChecked(
    val date: VkDate? = null,
    val expire: Int? = null,
    val success: OkResponse? = null,
    val userId: Int? = null
)
