@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

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
) : VkMethod<OkResponse>(
    "photos.reorderPhotos",
    jacksonTypeRef()
), UserMethod
