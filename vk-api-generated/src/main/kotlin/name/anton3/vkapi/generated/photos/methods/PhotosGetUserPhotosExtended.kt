@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.photos.objects.PhotoFull
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/photos.getUserPhotos]
 *
 * Returns a list of photos in which a user is tagged.
 *
 * @property userId User ID.
 * @property offset Offset needed to return a specific subset of photos. By default, '0'.
 * @property count Number of photos to return. Maximum value is 1000.
 * @property sort Sort order: '1' — by date the tag was added in ascending order, '0' — by date the tag was added in descending order
 */
data class PhotosGetUserPhotosExtended(
    var userId: Int? = null,
    var offset: Int? = null,
    var count: Int? = null,
    var sort: String? = null
) : VkMethod<VkList<PhotoFull>, UserMethod>("photos.getUserPhotos", jacksonTypeRef()) {
    init {
        unsafeParam("extended", "1")
    }
}
