@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.notifications.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.BoolInt
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/notifications.markAsViewed]
 *
 * Resets the counter of new notifications about other users' feedback to the current user's wall posts.
 *

 */
class NotificationsMarkAsViewed : VkMethod<BoolInt>(
    "notifications.markAsViewed",
    jacksonTypeRef()
), UserMethod
