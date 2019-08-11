@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/wall.restore]
 *
 * Restores a post deleted from a user wall or community wall.
 *
 * @property ownerId User ID or community ID from whose wall the post was deleted. Use a negative value to designate a community ID.
 * @property postId ID of the post to be restored.
 */
data class WallRestore(
    var ownerId: Int? = null,
    var postId: Int? = null
) : CheckedMethod<OkResponse, UserMethod>("wall.restore", jacksonTypeRef())
