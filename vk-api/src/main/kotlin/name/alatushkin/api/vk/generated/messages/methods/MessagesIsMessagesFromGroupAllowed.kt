@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.messages.objects.IsMessagesFromGroupAllowedResponse
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/messages.isMessagesFromGroupAllowed]
 *
 * Returns information whether sending messages from the community to current user is allowed.
 *
 * @property groupId Group ID.
 * @property userId User ID.
 */
data class MessagesIsMessagesFromGroupAllowed(
    var groupId: Long,
    var userId: Long
) : VkMethod<IsMessagesFromGroupAllowedResponse>(
    "messages.isMessagesFromGroupAllowed",
    jacksonTypeRef()
), UserGroupMethod
