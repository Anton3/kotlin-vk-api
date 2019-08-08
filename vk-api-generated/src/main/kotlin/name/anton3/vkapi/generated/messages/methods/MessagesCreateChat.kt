@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/messages.createChat]
 *
 * Creates a chat with several participants.
 *
 * @property userIds IDs of the users to be added to the chat.
 * @property title Chat title.
 */
data class MessagesCreateChat(
    var userIds: List<Int>,
    var title: String? = null
) : VkMethod<Int>("messages.createChat", jacksonTypeRef()),
    UserMethod
