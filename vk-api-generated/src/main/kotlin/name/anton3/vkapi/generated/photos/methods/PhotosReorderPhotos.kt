@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

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
    var ownerId: Int? = null,
    var photoId: Int,
    var before: Int? = null,
    var after: Int? = null
) : VkMethod<OkResponse>("photos.reorderPhotos", jacksonTypeRef()),
    UserMethod
