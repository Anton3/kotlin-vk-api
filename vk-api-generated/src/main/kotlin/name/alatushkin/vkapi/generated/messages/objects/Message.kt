package name.anton3.vkapi.generated.messages.objects

import name.anton3.vkapi.generated.common.objects.Geo
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property id Message ID
 * @property conversationMessageId Unique auto-incremented number for all messages with this peer
 * @property date Date when the message has been sent in Unixtime
 * @property peerId Peer ID
 * @property fromId Message author's ID
 * @property updateTime Date when the message has been updated in Unixtime
 * @property randomId ID used for sending messages. It returned only for outgoing messages
 * @property important Is it an important message
 * @property payload No description
 * @property text Message text
 * @property attachments No description
 * @property geo No description
 * @property action No description
 * @property keyboard No description
 */
data class Message(
    val id: Long,
    val conversationMessageId: Long? = null,
    val date: VkDate,
    val peerId: Long,
    val fromId: Long,
    val updateTime: Long? = null,
    val randomId: Long? = null,
    val important: Boolean? = null,
    val payload: String? = null,
    val text: String,
    val attachments: List<MessageAttachment>? = null,
    val geo: Geo? = null,
    val action: MessageAction? = null,
    val keyboard: KeyboardReturned? = null
)
