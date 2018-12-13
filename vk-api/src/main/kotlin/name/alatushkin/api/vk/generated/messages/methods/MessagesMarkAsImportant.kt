@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.markAsImportant]
 *
 * Marks and unmarks messages as important (starred).
 *
 * @property messageIds IDs of messages to mark as important.
 * @property important '1' — to add a star (mark as important), '0' — to remove the star
 */
data class MessagesMarkAsImportant(
    var messageIds: List<Long>? = null,
    var important: Boolean? = null
) : VkMethod<List<Long>>(
    "messages.markAsImportant",
    jacksonTypeRef()
), UserGroupMethod
