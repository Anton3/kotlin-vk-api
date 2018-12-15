package name.alatushkin.vkapi.generated.photos.objects

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
 * @property placerId ID of the tag creator
 * @property tagCreated Date when tag has been added in Unixtime
 * @property tagId Tag ID
 */
data class PhotoXtrTagInfo(
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
    val placerId: Long? = null,
    val tagCreated: Long? = null,
    val tagId: Long? = null
)
