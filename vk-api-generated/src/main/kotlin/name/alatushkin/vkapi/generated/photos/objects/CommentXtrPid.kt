package name.alatushkin.vkapi.generated.photos.objects

import name.alatushkin.vkapi.generated.common.objects.LikesInfo
import name.alatushkin.vkapi.generated.wall.objects.CommentAttachment
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
 * @property pid Photo ID
 */
data class CommentXtrPid(
    val id: Long,
    val fromId: Long,
    val date: VkDate,
    val text: String,
    val likes: LikesInfo? = null,
    val replyToUser: Long? = null,
    val replyToComment: Long? = null,
    val attachments: List<CommentAttachment>? = null,
    val pid: Long
)
