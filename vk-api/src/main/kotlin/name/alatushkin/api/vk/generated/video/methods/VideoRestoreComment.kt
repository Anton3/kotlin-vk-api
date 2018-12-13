@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.BoolInt
import name.alatushkin.api.vk.tokens.UserMethod

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
) : VkMethod<BoolInt>(
    "video.restoreComment",
    jacksonTypeRef()
), UserMethod
