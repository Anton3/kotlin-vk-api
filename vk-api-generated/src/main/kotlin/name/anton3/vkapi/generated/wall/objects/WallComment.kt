@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.comment.objects.Thread
import name.anton3.vkapi.generated.common.objects.LikesInfo
import name.anton3.vkapi.generated.messages.objects.MessageAttachmentBody
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property attachments No description
 * @property date Date when the comment has been added in Unixtime
 * @property fromId Author ID
 * @property id Comment ID
 * @property likes No description
 * @property realOffset Real position of the comment
 * @property replyToComment Replied comment ID
 * @property replyToUser Replied user ID
 * @property text Comment text
 * @property thread No description
 * @property postId No description
 * @property ownerId No description
 * @property parentsStack No description
 * @property deleted No description
 */
@JsonDeserialize(`as` = WallCommentImpl::class)
interface WallComment : MessageAttachmentBody {
    val attachments: List<CommentAttachment>?
    val date: VkDate
    val fromId: Int
    val id: Int
    val likes: LikesInfo?
    val realOffset: Int?
    val replyToComment: Int?
    val replyToUser: Int?
    val text: String
    val thread: Thread?
    val postId: Int?
    val ownerId: Int?
    val parentsStack: List<Int>?
    val deleted: Boolean?
}
