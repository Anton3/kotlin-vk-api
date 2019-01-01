@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.markAsImportant]
 *
 * Marks and unmarks messages as important (starred).
 *
 * @property messageIds IDs of messages to mark as important.
 * @property important '1' — to add a star (mark as important), '0' — to remove the star
 */
data class MessagesMarkAsImportant(
    var messageIds: List<Int>? = null,
    var important: Boolean? = null
) : VkMethod<List<Int>>("messages.markAsImportant", jacksonTypeRef()),
    UserGroupMethod
