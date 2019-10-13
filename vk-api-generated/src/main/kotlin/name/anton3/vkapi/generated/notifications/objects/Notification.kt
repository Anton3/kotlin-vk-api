@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.notifications.objects

import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property date Date when the event has been occurred
 * @property feedback No description
 * @property parent No description
 * @property reply No description
 * @property type Notification type
 */
data class Notification(
    val date: VkDate? = null,
    val feedback: Feedback? = null,
    val parent: NotificationParent? = null,
    val reply: Reply? = null,
    val type: String? = null
)
