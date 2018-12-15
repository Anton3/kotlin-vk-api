@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/messages.editChat]
 *
 * Edits the title of a chat.
 *
 * @property chatId Chat ID.
 * @property title New title of the chat.
 */
data class MessagesEditChat(
    var chatId: Long,
    var title: String
) : VkMethod<OkResponse>("messages.editChat", jacksonTypeRef()),
    UserMethod
