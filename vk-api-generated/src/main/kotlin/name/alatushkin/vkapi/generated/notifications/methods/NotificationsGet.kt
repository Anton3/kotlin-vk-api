@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.notifications.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.notifications.objects.GetResponse
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/notifications.get]
 *
 * Returns a list of notifications about other users' feedback to the current user's wall posts.
 *
 * @property count Number of notifications to return.
 * @property startFrom No description
 * @property filters Type of notifications to return: 'wall' — wall posts, 'mentions' — mentions in wall posts, comments, or topics, 'comments' — comments to wall posts, photos, and videos, 'likes' — likes, 'reposted' — wall posts that are copied from the current user's wall, 'followers' — new followers, 'friends' — accepted friend requests
 * @property startTime Earliest timestamp (in Unix time) of a notification to return. By default, 24 hours ago.
 * @property endTime Latest timestamp (in Unix time) of a notification to return. By default, the current time.
 */
data class NotificationsGet(
    var count: Long? = null,
    var startFrom: String? = null,
    var filters: List<String>? = null,
    var startTime: Long? = null,
    var endTime: Long? = null
) : VkMethod<GetResponse>("notifications.get", jacksonTypeRef()),
    UserMethod
