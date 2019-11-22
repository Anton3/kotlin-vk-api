@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/messages.addChatUser]
 *
 * Adds a new user to a chat.
 *
 * @property chatId Chat ID.
 * @property userId ID of the user to be added to the chat.
 * @property visibleMessagesCount Size of the messages history provided to the newly added user, up to 1000
 */
data class MessagesAddChatUser(
    var chatId: Int,
    var userId: Int,
    var visibleMessagesCount: Int? = null
) : VkMethod<OkResponse, UserMethod>("messages.addChatUser", jacksonTypeRef())
