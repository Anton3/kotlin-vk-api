@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserGroupMethod
import name.alatushkin.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/messages.markAsAnsweredConversation]
 *
 * Marks and unmarks conversations as unanswered.
 *
 * @property groupId Group ID (for group messages with group access token)
 * @property peerId ID of conversation to mark as important.
 * @property answered '1' — to mark as answered, '0' — to remove the mark
 */
data class MessagesMarkAsAnsweredConversation(
    var groupId: Long? = null,
    var peerId: Long,
    var answered: Boolean? = null
) : VkMethod<OkResponse>("messages.markAsAnsweredConversation", jacksonTypeRef()),
    UserGroupMethod
