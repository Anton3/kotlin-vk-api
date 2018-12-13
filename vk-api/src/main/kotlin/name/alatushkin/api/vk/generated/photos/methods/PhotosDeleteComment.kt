@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.BoolInt
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.deleteComment]
 *
 * Deletes a comment on the photo.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property commentId Comment ID.
 */
data class PhotosDeleteComment(
    var ownerId: Long? = null,
    var commentId: Long
) : VkMethod<BoolInt>(
    "photos.deleteComment",
    jacksonTypeRef()
), UserMethod
