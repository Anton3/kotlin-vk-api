package name.alatushkin.vkapi.generated.account.objects

/**
 * No description
 *
 * @property disabled Information whether notifications are disabled
 * @property disabledUntil Time until that notifications are disabled in Unixtime
 * @property conversations No description
 * @property settings No description
 */
data class PushSettings(
    val disabled: Boolean? = null,
    val disabledUntil: Long? = null,
    val conversations: PushConversations? = null,
    val settings: PushParams? = null
)