@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.photos.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/photos.edit]
 *
 * Edits the caption of a photo.
 *
 * @property ownerId ID of the user or community that owns the photo.
 * @property photoId Photo ID.
 * @property caption New caption for the photo. If this parameter is not set, it is considered to be equal to an empty string.
 * @property latitude 
 * @property longitude 
 * @property placeStr 
 * @property foursquareId 
 * @property deletePlace 
 */
data class PhotosEdit(
    var ownerId: Long? = null,
    var photoId: Long,
    var caption: String? = null,
    var latitude: Double? = null,
    var longitude: Double? = null,
    var placeStr: String? = null,
    var foursquareId: String? = null,
    var deletePlace: Boolean? = null
) : VkMethod<OkResponse>(
    "photos.edit",
    jacksonTypeRef()
), UserMethod
