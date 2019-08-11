@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/messages.denyMessagesFromGroup]
 *
 * Denies sending message from community to the current user.
 *
 * @property groupId Group ID.
 */
data class MessagesDenyMessagesFromGroup(
    var groupId: Int
) : CheckedMethod<OkResponse, UserMethod>("messages.denyMessagesFromGroup", jacksonTypeRef())
