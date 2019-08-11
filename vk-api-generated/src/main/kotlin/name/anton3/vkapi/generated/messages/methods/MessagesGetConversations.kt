@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.messages.objects.GetConversationsFilter
import name.anton3.vkapi.generated.messages.objects.GetConversationsResponse
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserGroupMethod

/**
 * [https://vk.com/dev/messages.getConversations]
 *
 * Returns a list of the current user's conversations.
 *
 * @property groupId Group ID (for group messages with group access token)
 * @property offset Offset needed to return a specific subset of conversations.
 * @property count Number of conversations to return.
 * @property filter Filter to apply: 'all' — all conversations, 'unread' — conversations with unread messages, 'important' — conversations, marked as important (only for community messages), 'unanswered' — conversations, marked as unanswered (only for community messages)
 * @property extended '1' — return extra information about users and communities
 * @property startMessageId ID of the message from what to return dialogs.
 * @property fields Profile and communities fields to return.
 */
data class MessagesGetConversations(
    var groupId: Int? = null,
    var offset: Int? = null,
    var count: Int? = null,
    var filter: GetConversationsFilter? = null,
    var extended: Boolean? = null,
    var startMessageId: Int? = null,
    var fields: List<String>? = null
) : CheckedMethod<GetConversationsResponse, UserGroupMethod>("messages.getConversations", jacksonTypeRef())
