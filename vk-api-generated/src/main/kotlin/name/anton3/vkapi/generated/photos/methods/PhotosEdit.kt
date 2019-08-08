@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/photos.edit]
 *
 * Edits the caption of a photo.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property photoId Photo ID.
 * @property caption New caption for the photo. If this parameter is not set, it is considered to be equal to an empty string.
 * @property latitude No description
 * @property longitude No description
 * @property placeStr No description
 * @property foursquareId No description
 * @property deletePlace No description
 */
data class PhotosEdit(
    var ownerId: Int? = null,
    var photoId: Int,
    var caption: String? = null,
    var latitude: Double? = null,
    var longitude: Double? = null,
    var placeStr: String? = null,
    var foursquareId: String? = null,
    var deletePlace: Boolean? = null
) : VkMethod<OkResponse>("photos.edit", jacksonTypeRef()),
    UserMethod
