@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/photos.reorderPhotos]
 *
 * Reorders the photo in the list of photos of the user album.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property photoId Photo ID.
 * @property before ID of the photo before which the photo in question shall be placed.
 * @property after ID of the photo after which the photo in question shall be placed.
 */
data class PhotosReorderPhotos(
    var ownerId: Long? = null,
    var photoId: Long,
    var before: Long? = null,
    var after: Long? = null
) : VkMethod<OkResponse>("photos.reorderPhotos", jacksonTypeRef()),
    UserMethod
