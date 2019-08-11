package name.anton3.vkapi.generated.account.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property disabled Information whether notifications are disabled
 * @property disabledUntil Time until that notifications are disabled in Unixtime
 * @property conversations No description
 * @property settings No description
 */
data class PushSettings(
    val disabled: BoolInt? = null,
    val disabledUntil: Int? = null,
    val conversations: PushConversations? = null,
    val settings: PushParams? = null
)
