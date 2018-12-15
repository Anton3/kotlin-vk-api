package name.alatushkin.vkapi.generated.account.objects

/**
 * No description
 *
 * @property peerId Peer ID
 * @property sound Information whether the sound are enabled
 * @property disabledUntil Time until that notifications are disabled in seconds
 */
data class PushConversationsItem(
    val peerId: Long? = null,
    val sound: Boolean? = null,
    val disabledUntil: Long? = null
)
