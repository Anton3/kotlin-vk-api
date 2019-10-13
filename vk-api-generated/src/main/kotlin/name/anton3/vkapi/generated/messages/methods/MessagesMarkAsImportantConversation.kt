@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/messages.markAsImportantConversation]
 *
 * Marks and unmarks conversations as important.
 *
 * @property peerId ID of conversation to mark as important.
 * @property important '1' — to add a star (mark as important), '0' — to remove the star
 * @property groupId Group ID (for group messages with group access token)
 */
data class MessagesMarkAsImportantConversation(
    var peerId: Int,
    var important: Boolean? = null,
    var groupId: Int? = null
) : VkMethod<OkResponse, UserGroupMethod>("messages.markAsImportantConversation", jacksonTypeRef())
