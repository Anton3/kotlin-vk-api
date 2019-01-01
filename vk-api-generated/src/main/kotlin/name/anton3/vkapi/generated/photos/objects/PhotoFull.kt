package name.anton3.vkapi.generated.photos.objects

import name.anton3.vkapi.generated.common.objects.Likes
import name.anton3.vkapi.generated.common.objects.ObjectCount
import name.anton3.vkapi.vktypes.VkDate

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
    val id: Int,
    val albumId: Int,
    val ownerId: Int,
    val userId: Int? = null,
    val sizes: List<Image>? = null,
    val postId: Int? = null,
    val width: Int? = null,
    val height: Int? = null,
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
