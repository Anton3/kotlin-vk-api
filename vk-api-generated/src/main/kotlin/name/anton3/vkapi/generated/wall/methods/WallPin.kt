@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/wall.pin]
 *
 * Pins the post on wall.
 *
 * @property ownerId ID of the user or community that owns the wall. By default, current user ID. Use a negative value to designate a community ID.
 * @property postId Post ID.
 */
data class WallPin(
    var ownerId: Int? = null,
    var postId: Int
) : CheckedMethod<OkResponse, UserMethod>("wall.pin", jacksonTypeRef())
