@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.messages.objects.Message
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/messages.getByConversationMessageId]
 *
 * Returns messages by their IDs within the conversation.
 *
 * @property peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
 * @property conversationMessageIds Conversation message IDs.
 * @property extended Information whether the response should be extended
 * @property fields Profile fields to return.
 * @property groupId Group ID (for group messages with group access token)
 */
data class MessagesGetByConversationMessageId(
    var peerId: Int? = null,
    var conversationMessageIds: List<Int>,
    var extended: Boolean? = null,
    var fields: List<String>? = null,
    var groupId: Int? = null
) : VkMethod<VkList<Message>, UserGroupMethod>("messages.getByConversationMessageId", jacksonTypeRef())
