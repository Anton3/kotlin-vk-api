@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property disabledUntil Time until that notifications are disabled in seconds
 * @property peerId Peer ID
 * @property sound Information whether the sound are enabled
 */
data class PushConversationsItem(
    val disabledUntil: Int,
    val peerId: Int,
    val sound: BoolInt
)
