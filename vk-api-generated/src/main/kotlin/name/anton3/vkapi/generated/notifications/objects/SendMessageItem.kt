@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.notifications.objects

/**
 * No description
 *
 * @property userId User ID
 * @property status Notification status
 * @property error No description
 */
data class SendMessageItem(
    val userId: Int? = null,
    val status: Boolean? = null,
    val error: SendMessageError? = null
)
