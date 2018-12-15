@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserGroupMethod
import name.alatushkin.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/messages.markAsImportantConversation]
 *
 * Marks and unmarks conversations as important.
 *
 * @property groupId Group ID (for group messages with group access token)
 * @property peerId ID of conversation to mark as important.
 * @property important '1' — to add a star (mark as important), '0' — to remove the star
 */
data class MessagesMarkAsImportantConversation(
    var groupId: Long? = null,
    var peerId: Long,
    var important: Boolean? = null
) : VkMethod<OkResponse>("messages.markAsImportantConversation", jacksonTypeRef()),
    UserGroupMethod
