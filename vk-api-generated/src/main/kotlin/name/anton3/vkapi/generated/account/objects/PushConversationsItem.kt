package name.anton3.vkapi.generated.account.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property peerId Peer ID
 * @property sound Information whether the sound are enabled
 * @property disabledUntil Time until that notifications are disabled in seconds
 */
data class PushConversationsItem(
    val peerId: Int? = null,
    val sound: BoolInt? = null,
    val disabledUntil: Int? = null
)
