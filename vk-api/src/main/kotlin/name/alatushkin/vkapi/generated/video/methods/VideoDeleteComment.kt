@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/video.deleteComment]
 *
 * Deletes a comment on a video.
 *
 * @property ownerId ID of the user or community that owns the video.
 * @property commentId ID of the comment to be deleted.
 */
data class VideoDeleteComment(
    var ownerId: Long? = null,
    var commentId: Long
) : VkMethod<OkResponse>(
    "video.deleteComment",
    jacksonTypeRef()
), UserMethod
