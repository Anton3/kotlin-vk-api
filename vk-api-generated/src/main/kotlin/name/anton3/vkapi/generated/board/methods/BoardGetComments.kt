@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.board.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.board.objects.GetCommentsResponse
import name.anton3.vkapi.generated.common.objects.GetCommentsSort
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserServiceMethod

/**
 * [https://vk.com/dev/board.getComments]
 *
 * Returns a list of comments on a topic on a community's discussion board.
 *
 * @property groupId ID of the community that owns the discussion board.
 * @property topicId Topic ID.
 * @property needLikes '1' — to return the 'likes' field, '0' — not to return the 'likes' field (default)
 * @property startCommentId No description
 * @property offset Offset needed to return a specific subset of comments.
 * @property count Number of comments to return.
 * @property sort Sort order: 'asc' — by creation date in chronological order, 'desc' — by creation date in reverse chronological order,
 */
data class BoardGetComments(
    var groupId: Int,
    var topicId: Int,
    var needLikes: Boolean? = null,
    var startCommentId: Int? = null,
    var offset: Int? = null,
    var count: Int? = null,
    var sort: GetCommentsSort? = null
) : CheckedMethod<GetCommentsResponse, UserServiceMethod>("board.getComments", jacksonTypeRef())
