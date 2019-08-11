@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/messages.removeChatUser]
 *
 * Allows the current user to leave a chat or, if the current user started the chat, allows the user to remove another user from the chat.
 *
 * @property chatId Chat ID.
 * @property userId ID of the user to be removed from the chat.
 */
data class MessagesRemoveChatUser(
    var chatId: Int,
    var userId: String
) : CheckedMethod<OkResponse, UserGroupMethod>("messages.removeChatUser", jacksonTypeRef())
