package name.alatushkin.vkapi.generated.board.objects

import name.alatushkin.vkapi.generated.wall.objects.CommentAttachment
import name.alatushkin.vkapi.vktypes.VkDate

data class TopicCommentImpl(
    override val id: Long,
    override val fromId: Long,
    override val date: VkDate,
    override val text: String,
    override val attachments: List<CommentAttachment>? = null,
    override val realOffset: Long? = null
) : TopicComment
