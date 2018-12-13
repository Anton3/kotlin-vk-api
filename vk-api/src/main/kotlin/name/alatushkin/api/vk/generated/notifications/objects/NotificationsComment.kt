package name.alatushkin.api.vk.generated.notifications.objects

import name.alatushkin.api.vk.generated.board.objects.Topic
import name.alatushkin.api.vk.generated.photos.objects.Photo
import name.alatushkin.api.vk.generated.video.objects.Video
import name.alatushkin.api.vk.generated.wall.objects.Wallpost
import name.alatushkin.api.vk.vktypes.VkDate

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
