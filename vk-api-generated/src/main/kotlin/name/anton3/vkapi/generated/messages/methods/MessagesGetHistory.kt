@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.messages.objects.GetHistoryResponse
import name.anton3.vkapi.generated.messages.objects.GetHistoryRev
import name.anton3.vkapi.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.getHistory]
 *
 * Returns message history for the specified user or group chat.
 *
 * @property offset Offset needed to return a specific subset of messages.
 * @property count Number of messages to return.
 * @property userId ID of the user whose message history you want to return.
 * @property peerId No description
 * @property startMessageId Starting message ID from which to return history.
 * @property extended Information whether the response should be extended
 * @property fields Profile fields to return.
 * @property groupId Group ID (for group messages with group access token)
 * @property rev Sort order: '1' — return messages in chronological order. '0' — return messages in reverse chronological order.
 */
data class MessagesGetHistory(
    var offset: Long? = null,
    var count: Long? = null,
    var userId: Long? = null,
    var peerId: Long? = null,
    var startMessageId: Long? = null,
    var extended: Boolean? = null,
    var fields: List<String>? = null,
    var groupId: Long? = null,
    var rev: GetHistoryRev? = null
) : VkMethod<GetHistoryResponse>("messages.getHistory", jacksonTypeRef()),
    UserGroupMethod
