@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.restore]
 *
 * Restores a deleted message.
 *
 * @property messageId ID of a previously-deleted message to restore.
 * @property groupId Group ID (for group messages with user access token)
 */
data class MessagesRestore(
    var messageId: Long,
    var groupId: Long? = null
) : VkMethod<OkResponse>(
    "messages.restore",
    jacksonTypeRef()
), UserGroupMethod
