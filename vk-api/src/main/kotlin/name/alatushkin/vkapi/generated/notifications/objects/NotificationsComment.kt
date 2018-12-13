package name.alatushkin.vkapi.generated.notifications.objects

import name.alatushkin.vkapi.generated.board.objects.Topic
import name.alatushkin.vkapi.generated.photos.objects.Photo
import name.alatushkin.vkapi.generated.video.objects.Video
import name.alatushkin.vkapi.generated.wall.objects.Wallpost
import name.alatushkin.vkapi.vktypes.VkDate

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
