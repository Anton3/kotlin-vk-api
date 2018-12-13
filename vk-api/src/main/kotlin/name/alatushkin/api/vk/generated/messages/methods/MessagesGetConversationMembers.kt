@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.NameCase
import name.alatushkin.api.vk.generated.messages.objects.GetConversationMembersResponse
import name.alatushkin.api.vk.tokens.UserGroupMethod

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
    var groupId: Long? = null,
    var peerId: Long? = null,
    var fields: List<String>? = null,
    var nameCase: NameCase? = null
) : VkMethod<GetConversationMembersResponse>(
    "messages.getConversationMembers",
    jacksonTypeRef()
), UserGroupMethod
