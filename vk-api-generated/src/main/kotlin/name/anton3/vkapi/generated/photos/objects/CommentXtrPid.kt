@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.objects

import name.anton3.vkapi.generated.common.objects.LikesInfo
import name.anton3.vkapi.generated.wall.objects.CommentAttachment
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
 * @property pid Photo ID
 */
data class CommentXtrPid(
    val id: Int,
    val fromId: Int,
    val date: VkDate,
    val text: String,
    val likes: LikesInfo? = null,
    val replyToUser: Int? = null,
    val replyToComment: Int? = null,
    val attachments: List<CommentAttachment>? = null,
    val pid: Int
)
