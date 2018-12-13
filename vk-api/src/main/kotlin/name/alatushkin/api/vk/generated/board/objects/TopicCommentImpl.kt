package name.alatushkin.api.vk.generated.board.objects

import name.alatushkin.api.vk.generated.wall.objects.CommentAttachment
import name.alatushkin.api.vk.vktypes.VkDate

data class TopicCommentImpl(
    override val id: Long,
    override val fromId: Long,
    override val date: VkDate,
    override val text: String,
    override val attachments: List<CommentAttachment>? = null,
    override val realOffset: Long? = null
) : TopicComment
