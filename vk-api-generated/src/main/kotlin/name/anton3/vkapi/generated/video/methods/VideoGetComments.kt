@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.video.objects.GetCommentsResponse
import name.anton3.vkapi.generated.video.objects.GetCommentsSort
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

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
data class VideoGetComments(
    var ownerId: Int? = null,
    var videoId: Int,
    var needLikes: Boolean? = null,
    var startCommentId: Int? = null,
    var offset: Int? = null,
    var count: Int? = null,
    var sort: GetCommentsSort? = null
) : VkMethod<GetCommentsResponse, UserMethod>("video.getComments", jacksonTypeRef())
