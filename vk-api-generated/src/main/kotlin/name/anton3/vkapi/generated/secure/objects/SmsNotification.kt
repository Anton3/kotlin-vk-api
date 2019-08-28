@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.secure.objects

import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property id Notification ID
 * @property appId Application ID
 * @property userId User ID
 * @property date Date when message has been sent in Unixtime
 * @property message Messsage text
 */
data class SmsNotification(
    val id: Int? = null,
    val appId: Int? = null,
    val userId: Int? = null,
    val date: VkDate? = null,
    val message: String? = null
)
