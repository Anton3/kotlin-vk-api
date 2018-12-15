package name.alatushkin.vkapi.generated.photos.objects

import name.alatushkin.vkapi.generated.common.objects.Likes
import name.alatushkin.vkapi.generated.common.objects.ObjectCount
import name.alatushkin.vkapi.vktypes.PropertyExists
import name.alatushkin.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property id Photo ID
 * @property albumId Album ID
 * @property ownerId Photo owner's ID
 * @property userId ID of the user who have uploaded the photo
 * @property sizes No description
 * @property photo75 URL of image with 75 px width
 * @property photo130 URL of image with 130 px width
 * @property photo604 URL of image with 604 px width
 * @property photo807 URL of image with 807 px width
 * @property photo1280 URL of image with 1280 px width
 * @property photo2560 URL of image with 2560 px width
 * @property postId Post ID
 * @property width Original photo width
 * @property height Original photo height
 * @property text Photo caption
 * @property date Date when uploaded
 * @property lat Latitude
 * @property long Longitude
 * @property accessKey Access key for the photo
 * @property likes No description
 * @property reposts No description
 * @property comments No description
 * @property canComment No description
 * @property tags No description
 * @property hidden Returns if the photo is hidden above the wall
 * @property realOffset Real position of the photo
 */
data class PhotoFullXtrRealOffset(
    val id: Long,
    val albumId: Long,
    val ownerId: Long,
    val userId: Long? = null,
    val sizes: List<PhotoSizes>? = null,
    val photo75: String? = null,
    val photo130: String? = null,
    val photo604: String? = null,
    val photo807: String? = null,
    val photo1280: String? = null,
    val photo2560: String? = null,
    val postId: Long? = null,
    val width: Long? = null,
    val height: Long? = null,
    val text: String? = null,
    val date: VkDate,
    val lat: Double? = null,
    val long: Double? = null,
    val accessKey: String? = null,
    val likes: Likes? = null,
    val reposts: ObjectCount? = null,
    val comments: ObjectCount? = null,
    val canComment: Boolean? = null,
    val tags: ObjectCount? = null,
    val hidden: PropertyExists? = null,
    val realOffset: Long? = null
)
