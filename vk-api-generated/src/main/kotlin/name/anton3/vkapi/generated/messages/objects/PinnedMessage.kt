@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

import name.anton3.vkapi.vktypes.VkDate

/**
 * Pinned message information
 *
 * @property id message id, or 0 if the current user history does not contain it
 * @property date sending time in Unixtime
 * @property fromId sender id
 * @property text message text
 * @property attachments No description
 * @property geo Place information
 * @property fwdMessages Forwarded messages
 */
data class PinnedMessage(
    val id: Int,
    val date: VkDate,
    val fromId: Int,
    val text: String,
    val attachments: List<MessageAttachment>? = null,
    val geo: PinnedMessageGeo? = null,
    val fwdMessages: List<Message>? = null
)
