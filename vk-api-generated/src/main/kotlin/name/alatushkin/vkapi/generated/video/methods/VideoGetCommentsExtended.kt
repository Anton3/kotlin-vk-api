@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.video.objects.GetCommentsSort
import name.anton3.vkapi.generated.wall.objects.WallComment
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/video.getComments]
 *
 * Returns a list of comments on a video.
 *
 * @property ownerId ID of the user or community that owns the video.
 * @property videoId Video ID.
 * @property needLikes '1' — to return an additional 'likes' field
 * @property startCommentId No description
 * @property offset Offset needed to return a specific subset of comments.
 * @property count Number of comments to return.
 * @property sort Sort order: 'asc' — oldest comment first, 'desc' — newest comment first
 */
data class VideoGetCommentsExtended(
    var ownerId: Long? = null,
    var videoId: Long,
    var needLikes: Boolean? = null,
    var startCommentId: Long? = null,
    var offset: Long? = null,
    var count: Long? = null,
    var sort: GetCommentsSort? = null
) : VkMethod<VkList<WallComment>>("video.getComments", jacksonTypeRef()),
    UserMethod {
    init {
        unsafeParam("extended", "1")
    }
}
