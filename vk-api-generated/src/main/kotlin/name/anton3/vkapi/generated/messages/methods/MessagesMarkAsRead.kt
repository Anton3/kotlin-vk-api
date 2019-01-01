@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserGroupMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/messages.markAsRead]
 *
 * Marks messages as read.
 *
 * @property messageIds IDs of messages to mark as read.
 * @property peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
 * @property startMessageId Message ID to start from.
 * @property groupId Group ID (for group messages with user access token)
 */
data class MessagesMarkAsRead(
    var messageIds: List<Int>? = null,
    var peerId: Int? = null,
    var startMessageId: Int? = null,
    var groupId: Int? = null
) : VkMethod<OkResponse>("messages.markAsRead", jacksonTypeRef()),
    UserGroupMethod
