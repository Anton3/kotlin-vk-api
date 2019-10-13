@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property disabledUntil Time until that notifications are disabled
 * @property sound No description
 */
data class ChatPushSettings(
    val disabledUntil: Int? = null,
    val sound: BoolInt? = null
)
