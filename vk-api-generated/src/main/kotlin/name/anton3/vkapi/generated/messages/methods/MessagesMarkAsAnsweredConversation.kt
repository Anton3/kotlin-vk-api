@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.vktypes.OkResponse

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
    var groupId: Int? = null,
    var peerId: Int,
    var answered: Boolean? = null
) : VkMethod<OkResponse>("messages.markAsAnsweredConversation", jacksonTypeRef()),
    UserGroupMethod
