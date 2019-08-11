@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/video.deleteComment]
 *
 * Deletes a comment on a video.
 *
 * @property ownerId ID of the user or community that owns the video.
 * @property commentId ID of the comment to be deleted.
 */
data class VideoDeleteComment(
    var ownerId: Int? = null,
    var commentId: Int
) : CheckedMethod<OkResponse, UserMethod>("video.deleteComment", jacksonTypeRef())
