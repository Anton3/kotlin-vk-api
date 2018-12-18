@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/wall.deleteComment]
 *
 * Deletes a comment on a post on a user wall or community wall.
 *
 * @property ownerId User ID or community ID. Use a negative value to designate a community ID.
 * @property commentId Comment ID.
 */
data class WallDeleteComment(
    var ownerId: Long? = null,
    var commentId: Long
) : VkMethod<OkResponse>("wall.deleteComment", jacksonTypeRef()),
    UserMethod
