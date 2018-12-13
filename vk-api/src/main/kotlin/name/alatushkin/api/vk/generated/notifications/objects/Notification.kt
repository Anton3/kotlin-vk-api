package name.alatushkin.api.vk.generated.notifications.objects

import name.alatushkin.api.vk.vktypes.VkDate

data class Notification(
    val type: String? = null,
    val date: VkDate? = null,
    val parent: NotificationParent? = null,
    val feedback: Feedback? = null,
    val reply: Reply? = null
)
