@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.board.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.wall.objects.CommentAttachment
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property attachments No description
 * @property date Date when the comment has been added in Unixtime
 * @property fromId Author ID
 * @property id Comment ID
 * @property realOffset Real position of the comment
 * @property text Comment text
 */
@JsonDeserialize(`as` = TopicCommentImpl::class)
interface TopicComment {
    val attachments: List<CommentAttachment>?
    val date: VkDate
    val fromId: Int
    val id: Int
    val realOffset: Int?
    val text: String
}
