@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.video.objects.GetCommentsResponse
import name.alatushkin.vkapi.generated.video.objects.GetCommentsSort
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/video.getComments]
 *
 * Returns a list of comments on a video.
 *
 * @property ownerId ID of the user or community that owns the video.
 * @property videoId Video ID.
 * @property needLikes '1' — to return an additional 'likes' field
 * @property startCommentId 
 * @property offset Offset needed to return a specific subset of comments.
 * @property count Number of comments to return.
 * @property sort Sort order: 'asc' — oldest comment first, 'desc' — newest comment first
 */
data class VideoGetComments(
    var ownerId: Long? = null,
    var videoId: Long,
    var needLikes: Boolean? = null,
    var startCommentId: Long? = null,
    var offset: Long? = null,
    var count: Long? = null,
    var sort: GetCommentsSort? = null
) : VkMethod<GetCommentsResponse>(
    "video.getComments",
    jacksonTypeRef()
), UserMethod
