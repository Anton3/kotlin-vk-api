package name.anton3.vkapi.generated.widgets.objects

import name.anton3.vkapi.generated.common.objects.LikesInfo
import name.anton3.vkapi.generated.common.objects.RepostsInfo
import name.anton3.vkapi.generated.users.objects.UserFull
import name.anton3.vkapi.generated.wall.objects.CommentAttachment
import name.anton3.vkapi.generated.wall.objects.PostSource
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property id Comment ID
 * @property fromId Comment author ID
 * @property toId Wall owner
 * @property date Date when the comment has been added in Unixtime
 * @property user No description
 * @property postType Post type
 * @property text Comment text
 * @property canDelete Information whether current user can delete the comment
 * @property media No description
 * @property attachments No description
 * @property postSource No description
 * @property comments No description
 * @property likes No description
 * @property reposts No description
 */
data class WidgetComment(
    val id: Long,
    val fromId: Long,
    val toId: Long,
    val date: VkDate,
    val user: UserFull? = null,
    val postType: Long,
    val text: String,
    val canDelete: Boolean? = null,
    val media: CommentMedia? = null,
    val attachments: List<CommentAttachment>? = null,
    val postSource: PostSource? = null,
    val comments: CommentReplies? = null,
    val likes: LikesInfo? = null,
    val reposts: RepostsInfo? = null
)
