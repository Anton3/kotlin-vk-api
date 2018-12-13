package name.alatushkin.api.vk.generated.widgets.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt
import name.alatushkin.api.vk.generated.common.objects.LikesInfo
import name.alatushkin.api.vk.generated.common.objects.RepostsInfo
import name.alatushkin.api.vk.generated.users.objects.UserFull
import name.alatushkin.api.vk.generated.wall.objects.CommentAttachment
import name.alatushkin.api.vk.generated.wall.objects.PostSource
import name.alatushkin.api.vk.vktypes.VkDate

data class WidgetComment(
    val id: Long,
    val fromId: Long,
    val toId: Long,
    val date: VkDate,
    val user: UserFull? = null,
    val postType: Long,
    val text: String,
    val canDelete: BoolInt? = null,
    val media: CommentMedia? = null,
    val attachments: List<CommentAttachment>? = null,
    val postSource: PostSource? = null,
    val comments: CommentReplies? = null,
    val likes: LikesInfo? = null,
    val reposts: RepostsInfo? = null
)
