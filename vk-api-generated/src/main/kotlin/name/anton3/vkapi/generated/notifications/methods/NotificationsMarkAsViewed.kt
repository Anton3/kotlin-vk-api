@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.notifications.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/notifications.markAsViewed]
 *
 * Resets the counter of new notifications about other users' feedback to the current user's wall posts.
 *

 */
class NotificationsMarkAsViewed : CheckedMethod<Boolean, UserMethod>("notifications.markAsViewed", jacksonTypeRef())
