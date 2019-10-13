@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.secure.objects

/**
 * No description
 *
 * @property appId Application ID
 * @property date Date when message has been sent in Unixtime
 * @property id Notification ID
 * @property message Messsage text
 * @property userId User ID
 */
data class SmsNotification(
    val appId: String? = null,
    val date: String? = null,
    val id: String? = null,
    val message: String? = null,
    val userId: String? = null
)
