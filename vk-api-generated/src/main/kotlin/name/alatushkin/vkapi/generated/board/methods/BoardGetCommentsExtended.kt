@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.board.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.board.objects.GetCommentsExtendedResponse
import name.alatushkin.vkapi.generated.common.objects.GetCommentsSort
import name.alatushkin.vkapi.tokens.UserServiceMethod

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
data class BoardGetCommentsExtended(
    var groupId: Long,
    var topicId: Long,
    var needLikes: Boolean? = null,
    var startCommentId: Long? = null,
    var offset: Long? = null,
    var count: Long? = null,
    var sort: GetCommentsSort? = null
) : VkMethod<GetCommentsExtendedResponse>("board.getComments", jacksonTypeRef()),
    UserServiceMethod {
    init {
        unsafeParam("extended", "1")
    }
}
