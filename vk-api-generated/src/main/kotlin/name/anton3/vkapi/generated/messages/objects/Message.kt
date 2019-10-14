@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

import name.anton3.vkapi.generated.common.objects.Geo
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property id Message ID
 * @property date Date when the message has been sent in Unixtime
 * @property peerId Peer ID
 * @property fromId Message author's ID
 * @property text Message text
 * @property randomId ID used for sending messages. It returned only for outgoing messages
 * @property ref Arbitrary parameter for working with referring sources
 * @property refSource Arbitrary parameter for working with referring sources
 * @property attachments No description
 * @property important Is it an important message
 * @property geo No description
 * @property payload No description
 * @property fwdMessages Forwarded messages
 * @property replyMessage No description
 * @property action No description
 * @property conversationMessageId Unique auto-incremented number for all messages with this peer
 * @property updateTime Date when the message has been updated in Unixtime
 * @property keyboard No description
 * @property isCropped No description
 */
data class Message(
    val id: Int,
    val date: VkDate,
    val peerId: Int,
    val fromId: Int,
    val text: String,
    val randomId: Int? = null,
    val ref: String? = null,
    val refSource: String? = null,
    val attachments: List<MessageAttachment>? = null,
    val important: Boolean? = null,
    val geo: Geo? = null,
    val payload: String? = null,
    val fwdMessages: List<Message>? = null,
    val replyMessage: Message? = null,
    val action: MessageAction? = null,
    val conversationMessageId: Int? = null,
    val updateTime: VkDate? = null,
    val keyboard: KeyboardReturned? = null,
    val isCropped: Boolean? = null
)
