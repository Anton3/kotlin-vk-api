package name.alatushkin.vkapi.generated.wall.objects

import name.alatushkin.vkapi.generated.common.objects.LikesInfo
import name.alatushkin.vkapi.vktypes.VkDate

data class WallCommentImpl(
    override val id: Long,
    override val fromId: Long,
    override val date: VkDate,
    override val text: String,
    override val likes: LikesInfo? = null,
    override val replyToUser: Long? = null,
    override val replyToComment: Long? = null,
    override val attachments: List<CommentAttachment>? = null,
    override val realOffset: Long? = null
) : WallComment
