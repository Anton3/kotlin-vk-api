@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.messages.objects.IsMessagesFromGroupAllowedResponse
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/messages.isMessagesFromGroupAllowed]
 *
 * Returns information whether sending messages from the community to current user is allowed.
 *
 * @property groupId Group ID.
 * @property userId User ID.
 */
data class MessagesIsMessagesFromGroupAllowed(
    var groupId: Int,
    var userId: Int
) : VkMethod<IsMessagesFromGroupAllowedResponse, UserGroupMethod>("messages.isMessagesFromGroupAllowed", jacksonTypeRef())
