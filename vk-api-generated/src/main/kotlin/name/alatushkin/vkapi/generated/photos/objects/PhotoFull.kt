package name.alatushkin.vkapi.generated.photos.objects

import name.alatushkin.vkapi.generated.common.objects.Likes
import name.alatushkin.vkapi.generated.common.objects.ObjectCount
import name.alatushkin.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property id Photo ID
 * @property albumId Album ID
 * @property ownerId Photo owner's ID
 * @property userId ID of the user who have uploaded the photo
 * @property sizes No description
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
 * @property canComment Information whether current user can comment the photo
 * @property tags No description
 */
data class PhotoFull(
    val id: Long,
    val albumId: Long,
    val ownerId: Long,
    val userId: Long? = null,
    val sizes: List<Image>? = null,
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
    val tags: ObjectCount? = null
)
