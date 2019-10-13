@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/messages.delete]
 *
 * Deletes one or more messages.
 *
 * @property messageIds Message IDs.
 * @property spam '1' — to mark message as spam.
 * @property groupId Group ID (for group messages with user access token)
 * @property deleteForAll '1' — delete message for for all.
 */
data class MessagesDelete(
    var messageIds: List<Int>? = null,
    var spam: Boolean? = null,
    var groupId: Int? = null,
    var deleteForAll: Boolean? = null
) : VkMethod<Map<Int, Boolean>, UserGroupMethod>("messages.delete", jacksonTypeRef())
