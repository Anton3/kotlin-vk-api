@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.messages.objects.GetConversationMembersResponse
import name.anton3.vkapi.generated.users.objects.Fields
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/messages.getConversationMembers]
 *
 * Returns a list of IDs of users participating in a chat.
 *
 * @property peerId Peer ID.
 * @property fields Profile fields to return.
 * @property groupId Group ID (for group messages with group access token)
 */
data class MessagesGetConversationMembers(
    var peerId: Int,
    var fields: List<Fields>? = null,
    var groupId: Int? = null
) : VkMethod<GetConversationMembersResponse, UserGroupMethod>("messages.getConversationMembers", jacksonTypeRef())
