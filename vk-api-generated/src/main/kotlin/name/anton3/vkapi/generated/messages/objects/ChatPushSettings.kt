@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property disabledUntil Time until that notifications are disabled
 * @property sound Information whether the sound is on
 */
data class ChatPushSettings(
    val disabledUntil: Int? = null,
    val sound: BoolInt? = null
)
