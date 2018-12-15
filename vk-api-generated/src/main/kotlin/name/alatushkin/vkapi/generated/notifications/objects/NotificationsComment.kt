package name.alatushkin.vkapi.generated.notifications.objects

import name.alatushkin.vkapi.generated.board.objects.Topic
import name.alatushkin.vkapi.generated.photos.objects.Photo
import name.alatushkin.vkapi.generated.video.objects.Video
import name.alatushkin.vkapi.generated.wall.objects.Wallpost
import name.alatushkin.vkapi.vktypes.VkDate

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
data class NotificationsComment(
    val id: Long? = null,
    val ownerId: Long? = null,
    val date: VkDate? = null,
    val text: String? = null,
    val photo: Photo? = null,
    val video: Video? = null,
    val post: Wallpost? = null,
    val topic: Topic? = null
) : NotificationParent
