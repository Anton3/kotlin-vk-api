package name.alatushkin.api.vk.generated.photos.objects

import name.alatushkin.api.vk.generated.messages.objects.MessageAttachment
import name.alatushkin.api.vk.generated.notifications.objects.NotificationParent
import name.alatushkin.api.vk.generated.wall.objects.CommentAttachment
import name.alatushkin.api.vk.generated.wall.objects.WallpostAttachment
import name.alatushkin.api.vk.vktypes.VkDate

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
