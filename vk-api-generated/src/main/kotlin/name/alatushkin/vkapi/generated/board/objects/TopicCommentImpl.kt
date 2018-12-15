package name.alatushkin.vkapi.generated.board.objects

import name.alatushkin.vkapi.generated.wall.objects.CommentAttachment
import name.alatushkin.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property id Comment ID
 * @property fromId Author ID
 * @property date Date when the comment has been added in Unixtime
 * @property text Comment text
 * @property attachments No description
 * @property realOffset Real position of the comment
 */
data class TopicCommentImpl(
    override val id: Long,
    override val fromId: Long,
    override val date: VkDate,
    override val text: String,
    override val attachments: List<CommentAttachment>? = null,
    override val realOffset: Long? = null
) : TopicComment
