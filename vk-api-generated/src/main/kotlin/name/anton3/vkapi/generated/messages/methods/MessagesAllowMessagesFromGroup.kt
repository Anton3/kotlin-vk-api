@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/messages.allowMessagesFromGroup]
 *
 * Allows sending messages from community to the current user.
 *
 * @property groupId Group ID.
 */
data class MessagesAllowMessagesFromGroup(
    var groupId: Long
) : VkMethod<OkResponse>("messages.allowMessagesFromGroup", jacksonTypeRef()),
    UserMethod
