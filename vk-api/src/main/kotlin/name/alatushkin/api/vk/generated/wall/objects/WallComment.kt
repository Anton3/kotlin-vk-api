package name.alatushkin.api.vk.generated.wall.objects

import name.alatushkin.api.vk.generated.common.objects.LikesInfo
import name.alatushkin.api.vk.generated.messages.objects.MessageAttachment
import name.alatushkin.api.vk.vktypes.VkDate

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
