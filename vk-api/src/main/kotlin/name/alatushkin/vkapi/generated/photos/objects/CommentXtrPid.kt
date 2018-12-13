package name.alatushkin.vkapi.generated.photos.objects

import name.alatushkin.vkapi.generated.common.objects.LikesInfo
import name.alatushkin.vkapi.generated.wall.objects.CommentAttachment
import name.alatushkin.vkapi.vktypes.VkDate

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
