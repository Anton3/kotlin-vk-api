package name.alatushkin.vkapi.generated.video.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt
import name.alatushkin.vkapi.generated.common.objects.PropertyExists
import name.alatushkin.vkapi.generated.messages.objects.MessageAttachment
import name.alatushkin.vkapi.generated.notifications.objects.NotificationParent
import name.alatushkin.vkapi.generated.wall.objects.CommentAttachment
import name.alatushkin.vkapi.generated.wall.objects.WallpostAttachment
import name.alatushkin.vkapi.vktypes.VkDate

interface Video : WallpostAttachment,
    CommentAttachment,
    MessageAttachment,
    NotificationParent {
    val id: Long?
    val ownerId: Long?
    val title: String?
    val duration: Long?
    val description: String?
    val date: VkDate?
    val views: Long?
    val comments: Long?
    val photo130: String?
    val photo320: String?
    val photo640: String?
    val photo800: String?
    val accessKey: String?
    val addingDate: Long?
    val player: String?
    val canEdit: BoolInt?
    val canAdd: BoolInt?
    val processing: PropertyExists?
    val live: PropertyExists?
    val files: VideoFiles?
    val platform: String?
    val width: Long?
    val height: Long?
}
