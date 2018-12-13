@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.messages.objects.ConversationWithMessage
import name.alatushkin.api.vk.tokens.UserGroupMethod
import name.alatushkin.api.vk.vktypes.VkList

/**
 * [https://vk.com/dev/messages.getConversationsById]
 *
 * Returns conversations by their IDs
 *
 * @property peerIds Destination IDs. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
 * @property extended Return extended properties
 * @property fields Profile and communities fields to return.
 * @property groupId Group ID (for group messages with group access token)
 */
data class MessagesGetConversationsById(
    var peerIds: List<Long>,
    var extended: Boolean? = null,
    var fields: List<String>? = null,
    var groupId: Long? = null
) : VkMethod<VkList<ConversationWithMessage>>(
    "messages.getConversationsById",
    jacksonTypeRef()
), UserGroupMethod
