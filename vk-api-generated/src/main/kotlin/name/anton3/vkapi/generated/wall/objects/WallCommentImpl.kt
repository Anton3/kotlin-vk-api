package name.anton3.vkapi.generated.wall.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.common.objects.LikesInfo
import name.anton3.vkapi.vktypes.VkDate

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
@JsonDeserialize(`as` = Void::class)
data class WallCommentImpl(
    override val id: Int,
    override val fromId: Int,
    override val date: VkDate,
    override val text: String,
    override val likes: LikesInfo? = null,
    override val replyToUser: Int? = null,
    override val replyToComment: Int? = null,
    override val attachments: List<CommentAttachment>? = null,
    override val realOffset: Int? = null
) : WallComment
