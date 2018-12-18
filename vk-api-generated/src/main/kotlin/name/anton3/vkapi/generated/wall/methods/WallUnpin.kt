@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/wall.unpin]
 *
 * Unpins the post on wall.
 *
 * @property ownerId ID of the user or community that owns the wall. By default, current user ID. Use a negative value to designate a community ID.
 * @property postId Post ID.
 */
data class WallUnpin(
    var ownerId: Long? = null,
    var postId: Long
) : VkMethod<OkResponse>("wall.unpin", jacksonTypeRef()),
    UserMethod
