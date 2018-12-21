package name.anton3.vkapi.generated.photos.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.messages.objects.MessageAttachment
import name.anton3.vkapi.generated.notifications.objects.NotificationParent
import name.anton3.vkapi.generated.wall.objects.CommentAttachment
import name.anton3.vkapi.generated.wall.objects.WallpostAttachment
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
 */
@JsonDeserialize(`as` = PhotoImpl::class)
interface Photo : WallpostAttachment,
    CommentAttachment,
    MessageAttachment,
    NotificationParent {

    val id: Long
    val albumId: Long
    val ownerId: Long
    val userId: Long?
    val sizes: List<Image>?
    val postId: Long?
    val width: Long?
    val height: Long?
    val text: String?
    val date: VkDate
    val lat: Double?
    val long: Double?
    val accessKey: String?
}
