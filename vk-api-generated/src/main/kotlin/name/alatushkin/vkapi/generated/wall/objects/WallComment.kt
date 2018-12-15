package name.alatushkin.vkapi.generated.wall.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.alatushkin.vkapi.generated.common.objects.LikesInfo
import name.alatushkin.vkapi.generated.messages.objects.MessageAttachment
import name.alatushkin.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property id Comment ID
 * @property fromId Author ID
 * @property date Date when the comment has been added in Unixtime
 * @property text Comment text
 * @property likes No description
 * @property replyToUser Replied user ID
 * @property replyToComment Replied comment ID
 * @property attachments No description
 * @property realOffset Real position of the comment
 */
@JsonDeserialize(`as` = WallCommentImpl::class)
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
