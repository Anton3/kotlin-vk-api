@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.messages.objects.GetConversationsFilter
import name.alatushkin.vkapi.generated.messages.objects.GetConversationsResponse
import name.alatushkin.vkapi.tokens.UserGroupMethod

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
    var groupId: Long? = null,
    var offset: Long? = null,
    var count: Long? = null,
    var filter: GetConversationsFilter? = null,
    var extended: Boolean? = null,
    var startMessageId: Long? = null,
    var fields: List<String>? = null
) : VkMethod<GetConversationsResponse>("messages.getConversations", jacksonTypeRef()),
    UserGroupMethod
