package name.anton3.vkapi.generated.notifications.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.board.objects.Topic
import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.generated.video.objects.Video
import name.anton3.vkapi.generated.wall.objects.Wallpost
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property id Comment ID
 * @property ownerId Author ID
 * @property date Date when the comment has been added in Unixtime
 * @property text Comment text
 * @property photo No description
 * @property video No description
 * @property post No description
 * @property topic No description
 */
@JsonDeserialize(`as` = Void::class)
data class NotificationsComment(
    val id: Int? = null,
    val ownerId: Int? = null,
    val date: VkDate? = null,
    val text: String? = null,
    val photo: Photo? = null,
    val video: Video? = null,
    val post: Wallpost? = null,
    val topic: Topic? = null
) : NotificationParent
