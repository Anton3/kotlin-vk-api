@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.BoolInt

/**
 * [https://vk.com/dev/photos.restoreComment]
 *
 * Restores a deleted comment on a photo.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property commentId ID of the deleted comment.
 */
data class PhotosRestoreComment(
    var ownerId: Int? = null,
    var commentId: Int
) : CheckedMethod<BoolInt, UserMethod>("photos.restoreComment", jacksonTypeRef())
