@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.messages.objects.LastActivity
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/messages.getLastActivity]
 *
 * Returns a user's current status and date of last activity.
 *
 * @property userId User ID.
 */
data class MessagesGetLastActivity(
    var userId: Int
) : VkMethod<LastActivity>("messages.getLastActivity", jacksonTypeRef()),
    UserMethod
