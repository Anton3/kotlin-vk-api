package name.alatushkin.api.vk.generated.photos.objects

import name.alatushkin.api.vk.generated.common.objects.LikesInfo
import name.alatushkin.api.vk.generated.wall.objects.CommentAttachment
import name.alatushkin.api.vk.vktypes.VkDate

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
