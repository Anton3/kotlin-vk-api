@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.objects

import com.fasterxml.jackson.annotation.JsonProperty
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property accessKey Access key for the photo
 * @property albumId Album ID
 * @property date Date when uploaded
 * @property height Original photo height
 * @property id Photo ID
 * @property lat Latitude
 * @property long Longitude
 * @property ownerId Photo owner's ID
 * @property photo1280 URL of image with 1280 px width
 * @property photo130 URL of image with 130 px width
 * @property photo2560 URL of image with 2560 px width
 * @property photo604 URL of image with 604 px width
 * @property photo75 URL of image with 75 px width
 * @property photo807 URL of image with 807 px width
 * @property placerId ID of the tag creator
 * @property postId Post ID
 * @property sizes No description
 * @property tagCreated Date when tag has been added in Unixtime
 * @property tagId Tag ID
 * @property text Photo caption
 * @property userId ID of the user who have uploaded the photo
 * @property width Original photo width
 */
data class PhotoXtrTagInfo(
    val accessKey: String? = null,
    val albumId: Int,
    val date: VkDate,
    val height: Int? = null,
    val id: Int,
    val lat: Double? = null,
    val long: Double? = null,
    val ownerId: Int,
    @get:JsonProperty("photo_1280") val photo1280: String? = null,
    @get:JsonProperty("photo_130") val photo130: String? = null,
    @get:JsonProperty("photo_2560") val photo2560: String? = null,
    @get:JsonProperty("photo_604") val photo604: String? = null,
    @get:JsonProperty("photo_75") val photo75: String? = null,
    @get:JsonProperty("photo_807") val photo807: String? = null,
    val placerId: Int? = null,
    val postId: Int? = null,
    val sizes: List<PhotoSizes>? = null,
    val tagCreated: Int? = null,
    val tagId: Int? = null,
    val text: String? = null,
    val userId: Int? = null,
    val width: Int? = null
)
