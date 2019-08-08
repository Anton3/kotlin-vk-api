@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/video.restoreComment]
 *
 * Restores a previously deleted comment on a video.
 *
 * @property ownerId ID of the user or community that owns the video.
 * @property commentId ID of the deleted comment.
 */
data class VideoRestoreComment(
    var ownerId: Int? = null,
    var commentId: Int
) : VkMethod<Boolean>("video.restoreComment", jacksonTypeRef()),
    UserMethod
