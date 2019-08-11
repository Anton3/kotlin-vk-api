@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.common.objects.NameCase
import name.anton3.vkapi.generated.messages.objects.GetConversationMembersResponse
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserGroupMethod

/**
 * [https://vk.com/dev/messages.getConversationMembers]
 *
 * Returns a list of IDs of users participating in a chat.
 *
 * @property groupId Group ID (for group messages with group access token)
 * @property peerId Peer ID.
 * @property fields Profile fields to return.
 * @property nameCase Case for declension of user name and surname: 'nom' — nominative (default), 'gen' — genitive, 'dat' — dative, 'acc' — accusative, 'ins' — instrumental, 'abl' — prepositional
 */
data class MessagesGetConversationMembers(
    var groupId: Int? = null,
    var peerId: Int? = null,
    var fields: List<String>? = null,
    var nameCase: NameCase? = null
) : CheckedMethod<GetConversationMembersResponse, UserGroupMethod>("messages.getConversationMembers", jacksonTypeRef())
