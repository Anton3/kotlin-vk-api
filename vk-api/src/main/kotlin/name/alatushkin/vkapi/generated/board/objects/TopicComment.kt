package name.alatushkin.vkapi.generated.board.objects

import name.alatushkin.vkapi.generated.wall.objects.CommentAttachment
import name.alatushkin.vkapi.vktypes.VkDate

interface TopicComment {
    val id: Long
    val fromId: Long
    val date: VkDate
    val text: String
    val attachments: List<CommentAttachment>?
    val realOffset: Long?
}
