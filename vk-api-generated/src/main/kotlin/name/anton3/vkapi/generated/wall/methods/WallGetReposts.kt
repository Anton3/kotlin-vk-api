@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.wall.objects.GetRepostsResponse
import name.anton3.vkapi.tokens.UserServiceMethod

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
    var ownerId: Int? = null,
    var postId: Int? = null,
    var offset: Int? = null,
    var count: Int? = null
) : VkMethod<GetRepostsResponse>("wall.getReposts", jacksonTypeRef()),
    UserServiceMethod
