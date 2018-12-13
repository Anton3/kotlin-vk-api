@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

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
) : VkMethod<OkResponse>(
    "messages.addChatUser",
    jacksonTypeRef()
), UserMethod
