@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/messages.createChat]
 *
 * Creates a chat with several participants.
 *
 * @property userIds IDs of the users to be added to the chat.
 * @property title Chat title.
 */
data class MessagesCreateChat(
    var userIds: List<Long>,
    var title: String? = null
) : VkMethod<Long>("messages.createChat", jacksonTypeRef()),
    UserMethod
