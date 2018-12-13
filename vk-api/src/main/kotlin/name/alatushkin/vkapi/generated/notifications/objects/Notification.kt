package name.alatushkin.vkapi.generated.notifications.objects

import name.alatushkin.vkapi.vktypes.VkDate

data class Notification(
    val type: String? = null,
    val date: VkDate? = null,
    val parent: NotificationParent? = null,
    val feedback: Feedback? = null,
    val reply: Reply? = null
)
