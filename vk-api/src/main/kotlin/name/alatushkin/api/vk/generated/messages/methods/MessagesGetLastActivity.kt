@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.messages.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.messages.objects.LastActivity
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/messages.getLastActivity]
 *
 * Returns a user's current status and date of last activity.
 *
 * @property userId User ID.
 */
data class MessagesGetLastActivity(
    var userId: Long
) : VkMethod<LastActivity>(
    "messages.getLastActivity",
    jacksonTypeRef()
), UserMethod
