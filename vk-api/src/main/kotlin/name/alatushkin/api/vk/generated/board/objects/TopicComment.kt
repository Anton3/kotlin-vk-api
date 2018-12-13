package name.alatushkin.api.vk.generated.board.objects

import name.alatushkin.api.vk.generated.wall.objects.CommentAttachment
import name.alatushkin.api.vk.vktypes.VkDate

interface TopicComment {
    val id: Long
    val fromId: Long
    val date: VkDate
    val text: String
    val attachments: List<CommentAttachment>?
    val realOffset: Long?
}
