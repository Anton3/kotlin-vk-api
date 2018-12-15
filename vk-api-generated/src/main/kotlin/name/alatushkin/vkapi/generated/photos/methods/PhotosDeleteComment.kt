@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod

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
