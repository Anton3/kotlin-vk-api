@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.common.objects.ChronologicalSort
import name.anton3.vkapi.generated.messages.objects.GetHistoryResponse
import name.anton3.vkapi.generated.users.objects.Fields
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod

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
 * @property rev Sort order: '1' — return messages in chronological order. '0' — return messages in reverse chronological order.
 * @property extended Information whether the response should be extended
 * @property fields Profile fields to return.
 * @property groupId Group ID (for group messages with group access token)
 */
data class MessagesGetHistory(
    var offset: Int? = null,
    var count: Int? = null,
    var userId: Int? = null,
    var peerId: Int? = null,
    var startMessageId: Int? = null,
    var rev: ChronologicalSort? = null,
    var extended: Boolean? = null,
    var fields: List<Fields>? = null,
    var groupId: Int? = null
) : VkMethod<GetHistoryResponse, UserGroupMethod>("messages.getHistory", jacksonTypeRef())
