@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.notifications.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.BoolInt

/**
 * [https://vk.com/dev/notifications.markAsViewed]
 *
 * Resets the counter of new notifications about other users' feedback to the current user's wall posts.
 *

 */
class NotificationsMarkAsViewed : VkMethod<BoolInt, UserMethod>("notifications.markAsViewed", jacksonTypeRef())
