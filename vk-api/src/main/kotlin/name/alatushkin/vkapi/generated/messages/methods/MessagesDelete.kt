@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.delete]
 *
 * Deletes one or more messages.
 *
 * @property messageIds Message IDs.
 * @property spam '1' — to mark message as spam.
 * @property deleteForAll '1' — delete message for for all.
 * @property groupId Group ID (for group messages with user access token)
 */
data class MessagesDelete(
    var messageIds: List<Long>? = null,
    var spam: Boolean? = null,
    var deleteForAll: Boolean? = null,
    var groupId: Long? = null
) : VkMethod<Map<Long, Boolean>>(
    "messages.delete",
    jacksonTypeRef()
), UserGroupMethod
