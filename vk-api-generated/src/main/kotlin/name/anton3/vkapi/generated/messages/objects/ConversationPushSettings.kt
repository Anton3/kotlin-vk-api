@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

/**
 * push-notifications settings
 *
 * @property disabledUntil timestamp, to which notification are disables
 * @property disabledForever true, if notifications are disabled totally
 * @property noSound true, if notification alert sound is disabled
 */
data class ConversationPushSettings(
    val disabledUntil: Int,
    val disabledForever: Boolean? = null,
    val noSound: Boolean? = null
)
