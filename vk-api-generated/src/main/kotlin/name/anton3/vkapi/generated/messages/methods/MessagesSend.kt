@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.messages.objects.Keyboard
import name.anton3.vkapi.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.send]
 *
 * Sends a message.
 *
 * @property userId User ID (by default — current user).
 * @property randomId Unique identifier to avoid resending the message.
 * @property peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
 * @property domain User's short address (for example, 'illarionov').
 * @property chatId ID of conversation the message will relate to.
 * @property userIds IDs of message recipients (if new conversation shall be started).
 * @property message (Required if 'attachments' is not set.) Text of the message.
 * @property lat Geographical latitude of a check-in, in degrees (from -90 to 90).
 * @property long Geographical longitude of a check-in, in degrees (from -180 to 180).
 * @property attachment (Required if 'message' is not set.) List of objects attached to the message, separated by commas, in the following format: "<owner_id>_<media_id>", '' — Type of media attachment: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, 'wall' — wall post, '<owner_id>' — ID of the media attachment owner. '<media_id>' — media attachment ID. Example: "photo100172_166443618"
 * @property replyTo Id of replied message.
 * @property forwardMessages ID of forwarded messages, separated with a comma. Listed messages of the sender will be shown in the message body at the recipient's. Example: "123,431,544"
 * @property stickerId Sticker id.
 * @property groupId Group ID (for group messages with group access token)
 * @property keyboard keyboard to message
 * @property payload Hidden message (escaped JSON)
 * @property dontParseLinks 1 - links will not attach snippet
 * @property disableMentions 1 - mention of user will not generate notification for him
 * @property notification '1' if the message is a notification (for community messages).
 */
data class MessagesSend(
    var userId: Int? = null,
    var randomId: Int? = null,
    var peerId: Int? = null,
    var domain: String? = null,
    var chatId: Int? = null,
    var userIds: List<Int>? = null,
    var message: String? = null,
    var lat: Double? = null,
    var long: Double? = null,
    var attachment: List<String>? = null,
    var replyTo: Int? = null,
    var forwardMessages: String? = null,
    var stickerId: Int? = null,
    var groupId: Int? = null,
    var keyboard: Keyboard? = null,
    var payload: String? = null,
    var dontParseLinks: Boolean? = null,
    var disableMentions: Boolean? = null,
    var notification: Boolean? = null
) : VkMethod<Int>("messages.send", jacksonTypeRef()),
    UserGroupMethod
