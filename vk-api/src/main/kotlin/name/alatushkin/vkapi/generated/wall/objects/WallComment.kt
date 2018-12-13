package name.alatushkin.vkapi.generated.wall.objects

import name.alatushkin.vkapi.generated.common.objects.LikesInfo
import name.alatushkin.vkapi.generated.messages.objects.MessageAttachment
import name.alatushkin.vkapi.vktypes.VkDate

interface WallComment : MessageAttachment {
    val id: Long
    val fromId: Long
    val date: VkDate
    val text: String
    val likes: LikesInfo?
    val replyToUser: Long?
    val replyToComment: Long?
    val attachments: List<CommentAttachment>?
    val realOffset: Long?
}
