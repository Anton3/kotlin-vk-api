@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.deleteConversation]
 *
 * Deletes all private messages in a conversation.
 *
 * @property userId User ID. To clear a chat history use 'chat_id'
 * @property groupId Group ID (for group messages with user access token)
 * @property peerId Destination ID. "For user: 'User ID', e.g. '12345'. For chat: '2000000000' + 'chat_id', e.g. '2000000001'. For community: '- community ID', e.g. '-12345'. "
 * @property offset Offset needed to delete a specific subset of conversations.
 * @property count Number of conversations to delete. "NOTE: If the number of messages exceeds the maximum, the method shall be called several times."
 */
data class MessagesDeleteConversation(
    var userId: String? = null,
    var groupId: Long? = null,
    var peerId: Long? = null,
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<OkResponse>(
    "messages.deleteConversation",
    jacksonTypeRef()
), UserGroupMethod
