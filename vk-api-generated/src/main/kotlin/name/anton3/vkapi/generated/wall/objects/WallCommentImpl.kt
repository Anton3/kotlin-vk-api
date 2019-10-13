@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.comment.objects.Thread
import name.anton3.vkapi.generated.common.objects.LikesInfo
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
@JsonDeserialize(`as` = Void::class)
data class WallCommentImpl(
    override val attachments: List<CommentAttachment>? = null,
    override val date: VkDate,
    override val fromId: Int,
    override val id: Int,
    override val likes: LikesInfo? = null,
    override val realOffset: Int? = null,
    override val replyToComment: Int? = null,
    override val replyToUser: Int? = null,
    override val text: String,
    override val thread: Thread? = null,
    override val postId: Int? = null,
    override val ownerId: Int? = null,
    override val parentsStack: List<Int>? = null,
    override val deleted: Boolean? = null
) : WallComment
