@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.wall.objects.GetRepostsResponse
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/wall.getReposts]
 *
 * Returns information about reposts of a post on user wall or community wall.
 *
 * @property ownerId User ID or community ID. By default, current user ID. Use a negative value to designate a community ID.
 * @property postId Post ID.
 * @property offset Offset needed to return a specific subset of reposts.
 * @property count Number of reposts to return.
 */
data class WallGetReposts(
    var ownerId: Long? = null,
    var postId: Long? = null,
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<GetRepostsResponse>(
    "wall.getReposts",
    jacksonTypeRef()
), UserServiceMethod
