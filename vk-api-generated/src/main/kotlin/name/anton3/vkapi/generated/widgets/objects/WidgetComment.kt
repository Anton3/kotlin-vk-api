@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.widgets.objects

import name.anton3.vkapi.generated.common.objects.LikesInfo
import name.anton3.vkapi.generated.common.objects.RepostsInfo
import name.anton3.vkapi.generated.users.objects.UserFull
import name.anton3.vkapi.generated.wall.objects.CommentAttachment
import name.anton3.vkapi.generated.wall.objects.PostSource
import name.anton3.vkapi.vktypes.BoolInt
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property attachments No description
 * @property canDelete Information whether current user can delete the comment
 * @property comments No description
 * @property date Date when the comment has been added in Unixtime
 * @property fromId Comment author ID
 * @property id Comment ID
 * @property likes No description
 * @property media No description
 * @property postSource No description
 * @property postType Post type
 * @property reposts No description
 * @property text Comment text
 * @property toId Wall owner
 * @property user No description
 */
data class WidgetComment(
    val attachments: List<CommentAttachment>? = null,
    val canDelete: BoolInt? = null,
    val comments: CommentReplies? = null,
    val date: VkDate,
    val fromId: Int,
    val id: Int,
    val likes: LikesInfo? = null,
    val media: CommentMedia? = null,
    val postSource: PostSource? = null,
    val postType: Int,
    val reposts: RepostsInfo? = null,
    val text: String,
    val toId: Int,
    val user: UserFull? = null
)
