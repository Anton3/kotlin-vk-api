@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod

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
) : VkMethod<Boolean>("photos.deleteComment", jacksonTypeRef()),
    UserMethod
