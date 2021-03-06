@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.common.objects.GetCommentsSort
import name.anton3.vkapi.generated.common.objects.UserGroupFields
import name.anton3.vkapi.generated.wall.objects.GetCommentsExtendedResponse
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/wall.getComments]
 *
 * Returns a list of comments on a post on a user wall or community wall.
 *
 * @property ownerId User ID or community ID. Use a negative value to designate a community ID.
 * @property postId Post ID.
 * @property needLikes '1' — to return the 'likes' field, '0' — not to return the 'likes' field (default)
 * @property startCommentId No description
 * @property offset Offset needed to return a specific subset of comments.
 * @property count Number of comments to return (maximum 100).
 * @property sort Sort order: 'asc' — chronological, 'desc' — reverse chronological
 * @property previewLength Number of characters at which to truncate comments when previewed. By default, '90'. Specify '0' if you do not want to truncate comments.
 * @property fields No description
 * @property commentId Comment ID.
 * @property threadItemsCount Count items in threads.
 */
data class WallGetCommentsExtended(
    var ownerId: Int? = null,
    var postId: Int? = null,
    var needLikes: Boolean? = null,
    var startCommentId: Int? = null,
    var offset: Int? = null,
    var count: Int? = null,
    var sort: GetCommentsSort? = null,
    var previewLength: Int? = null,
    var fields: List<UserGroupFields>? = null,
    var commentId: Int? = null,
    var threadItemsCount: Int? = null
) : VkMethod<GetCommentsExtendedResponse, UserServiceMethod>("wall.getComments", jacksonTypeRef()) {
    init {
        unsafeParam("extended", "1")
    }
}
