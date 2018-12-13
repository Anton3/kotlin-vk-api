package name.alatushkin.vkapi.generated.widgets.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt
import name.alatushkin.vkapi.generated.common.objects.LikesInfo
import name.alatushkin.vkapi.generated.common.objects.RepostsInfo
import name.alatushkin.vkapi.generated.users.objects.UserFull
import name.alatushkin.vkapi.generated.wall.objects.CommentAttachment
import name.alatushkin.vkapi.generated.wall.objects.PostSource
import name.alatushkin.vkapi.vktypes.VkDate

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
