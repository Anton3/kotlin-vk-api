@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.common.objects.UserGroupFields
import name.anton3.vkapi.generated.messages.objects.Conversation
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/messages.getConversationsById]
 *
 * Returns conversations by their IDs
 *
 * @property peerIds Destination IDs. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
 * @property fields Profile and communities fields to return.
 * @property groupId Group ID (for group messages with group access token)
 */
data class MessagesGetConversationsById(
    var peerIds: List<Int>,
    var fields: List<UserGroupFields>? = null,
    var groupId: Int? = null
) : VkMethod<VkList<Conversation>, UserGroupMethod>("messages.getConversationsById", jacksonTypeRef())
