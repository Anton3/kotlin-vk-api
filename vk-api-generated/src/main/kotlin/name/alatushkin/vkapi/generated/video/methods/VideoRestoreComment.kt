@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/video.restoreComment]
 *
 * Restores a previously deleted comment on a video.
 *
 * @property ownerId ID of the user or community that owns the video.
 * @property commentId ID of the deleted comment.
 */
data class VideoRestoreComment(
    var ownerId: Long? = null,
    var commentId: Long
) : VkMethod<Boolean>("video.restoreComment", jacksonTypeRef()),
    UserMethod
