package name.anton3.vkapi.generated.notifications.objects

import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property type Notification type
 * @property date Date when the event has been occured
 * @property parent No description
 * @property feedback No description
 * @property reply No description
 */
data class Notification(
    val type: String? = null,
    val date: VkDate? = null,
    val parent: NotificationParent? = null,
    val feedback: Feedback? = null,
    val reply: Reply? = null
)
