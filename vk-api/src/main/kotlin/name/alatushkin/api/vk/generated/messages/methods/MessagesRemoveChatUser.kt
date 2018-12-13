@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/messages.removeChatUser]
 *
 * Allows the current user to leave a chat or, if the current user started the chat, allows the user to remove another user from the chat.
 *
 * @property chatId Chat ID.
 * @property userId ID of the user to be removed from the chat.
 */
data class MessagesRemoveChatUser(
    var chatId: Long,
    var userId: String
) : VkMethod<OkResponse>(
    "messages.removeChatUser",
    jacksonTypeRef()
), UserMethod
