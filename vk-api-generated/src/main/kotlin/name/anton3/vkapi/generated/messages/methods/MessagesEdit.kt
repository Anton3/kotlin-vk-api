@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.edit]
 *
 * Edits the message.
 *
 * @property peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
 * @property message (Required if 'attachments' is not set.) Text of the message.
 * @property lat Geographical latitude of a check-in, in degrees (from -90 to 90).
 * @property long Geographical longitude of a check-in, in degrees (from -180 to 180).
 * @property attachment (Required if 'message' is not set.) List of objects attached to the message, separated by commas, in the following format: "<owner_id>_<media_id>", '' — Type of media attachment: 'photo' — photo, 'video' — video, 'audio' — audio, 'doc' — document, 'wall' — wall post, '<owner_id>' — ID of the media attachment owner. '<media_id>' — media attachment ID. Example: "photo100172_166443618"
 * @property keepForwardMessages '1' — to keep forwarded, messages.
 * @property keepSnippets '1' — to keep attached snippets.
 * @property groupId Group ID (for group messages with user access token)
 */
data class MessagesEdit(
    var peerId: Int,
    var message: String? = null,
    var lat: Double? = null,
    var long: Double? = null,
    var attachment: List<String>? = null,
    var keepForwardMessages: Boolean? = null,
    var keepSnippets: Boolean? = null,
    var groupId: Int? = null
) : VkMethod<Boolean>("messages.edit", jacksonTypeRef()),
    UserGroupMethod
