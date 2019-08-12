@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/messages.restore]
 *
 * Restores a deleted message.
 *
 * @property messageId ID of a previously-deleted message to restore.
 * @property groupId Group ID (for group messages with user access token)
 */
data class MessagesRestore(
    var messageId: Int,
    var groupId: Int? = null
) : VkMethod<OkResponse, UserGroupMethod>("messages.restore", jacksonTypeRef())
