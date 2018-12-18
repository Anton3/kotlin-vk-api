@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/messages.addChatUser]
 *
 * Adds a new user to a chat.
 *
 * @property chatId Chat ID.
 * @property userId ID of the user to be added to the chat.
 */
data class MessagesAddChatUser(
    var chatId: Long,
    var userId: Long
) : VkMethod<OkResponse>("messages.addChatUser", jacksonTypeRef()),
    UserMethod
