package name.alatushkin.api.vk.generated.wall.objects

import name.alatushkin.api.vk.generated.common.objects.LikesInfo
import name.alatushkin.api.vk.vktypes.VkDate

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
