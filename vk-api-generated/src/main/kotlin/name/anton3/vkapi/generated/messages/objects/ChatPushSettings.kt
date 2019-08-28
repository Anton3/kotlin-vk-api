@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property sound Information whether the sound is on
 * @property disabledUntil Time until that notifications are disabled
 */
data class ChatPushSettings(
    val sound: BoolInt? = null,
    val disabledUntil: Int? = null
)
