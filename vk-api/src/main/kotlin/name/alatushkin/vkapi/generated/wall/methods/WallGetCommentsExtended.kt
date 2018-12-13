@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.wall.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.GetCommentsSort
import name.alatushkin.vkapi.generated.wall.objects.GetCommentsExtendedResponse
import name.alatushkin.vkapi.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/wall.getComments]
 *
 * Returns a list of comments on a post on a user wall or community wall.
 *
 * @property ownerId User ID or community ID. Use a negative value to designate a community ID.
 * @property postId Post ID.
 * @property needLikes '1' — to return the 'likes' field, '0' — not to return the 'likes' field (default)
 * @property startCommentId 
 * @property offset Offset needed to return a specific subset of comments.
 * @property count Number of comments to return (maximum 100).
 * @property sort Sort order: 'asc' — chronological, 'desc' — reverse chronological
 * @property previewLength Number of characters at which to truncate comments when previewed. By default, '90'. Specify '0' if you do not want to truncate comments.
 */
data class WallGetCommentsExtended(
    var ownerId: Long? = null,
    var postId: Long,
    var needLikes: Boolean? = null,
    var startCommentId: Long? = null,
    var offset: Long? = null,
    var count: Long? = null,
    var sort: GetCommentsSort? = null,
    var previewLength: Long? = null
) : VkMethod<GetCommentsExtendedResponse>(
    "wall.getComments",
    jacksonTypeRef()
), UserServiceMethod {
    init {
        unsafeParam("extended", "1")
    }
}
