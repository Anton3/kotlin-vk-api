package name.alatushkin.vkapi.generated.board.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
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
@JsonDeserialize(`as` = TopicCommentImpl::class)
interface TopicComment {
    val id: Long
    val fromId: Long
    val date: VkDate
    val text: String
    val attachments: List<CommentAttachment>?
    val realOffset: Long?
}
