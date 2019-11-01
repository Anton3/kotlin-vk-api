@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property disabled Information whether notifications are disabled
 * @property disabledUntil Time until that notifications are disabled in Unixtime
 * @property settings No description
 * @property conversations No description
 */
data class PushSettings(
    val disabled: BoolInt? = null,
    val disabledUntil: Int? = null,
    val settings: PushParams? = null,
    val conversations: PushConversations? = null
)
