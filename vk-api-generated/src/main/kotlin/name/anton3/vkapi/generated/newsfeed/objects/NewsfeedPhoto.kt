package name.anton3.vkapi.generated.newsfeed.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.common.objects.Likes
import name.anton3.vkapi.generated.common.objects.ObjectCount
import name.anton3.vkapi.generated.photos.objects.Image
import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property likes No description
 * @property comments No description
 * @property canComment Information whether current user can comment the photo
 * @property canRepost Information whether current user can repost the photo
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
 */
@JsonDeserialize(`as` = Void::class)
data class NewsfeedPhoto(
    val likes: Likes? = null,
    val comments: ObjectCount? = null,
    val canComment: Boolean? = null,
    val canRepost: Boolean? = null,
    override val id: Int,
    override val albumId: Int,
    override val ownerId: Int,
    override val userId: Int? = null,
    override val sizes: List<Image>? = null,
    override val postId: Int? = null,
    override val width: Int? = null,
    override val height: Int? = null,
    override val text: String? = null,
    override val date: VkDate,
    override val lat: Double? = null,
    override val long: Double? = null,
    override val accessKey: String? = null
) : Photo
