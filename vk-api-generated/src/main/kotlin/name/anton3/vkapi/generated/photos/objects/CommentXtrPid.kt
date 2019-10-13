@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.objects

import name.anton3.vkapi.generated.comment.objects.Thread
import name.anton3.vkapi.generated.common.objects.LikesInfo
import name.anton3.vkapi.generated.wall.objects.CommentAttachment
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property attachments No description
 * @property date Date when the comment has been added in Unixtime
 * @property fromId Author ID
 * @property id Comment ID
 * @property likes No description
 * @property pid Photo ID
 * @property replyToComment Replied comment ID
 * @property replyToUser Replied user ID
 * @property text Comment text
 * @property parentsStack No description
 * @property thread No description
 */
data class CommentXtrPid(
    val attachments: List<CommentAttachment>? = null,
    val date: VkDate,
    val fromId: Int,
    val id: Int,
    val likes: LikesInfo? = null,
    val pid: Int,
    val replyToComment: Int? = null,
    val replyToUser: Int? = null,
    val text: String,
    val parentsStack: List<Int>? = null,
    val thread: Thread? = null
)
