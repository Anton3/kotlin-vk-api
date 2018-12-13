package name.alatushkin.vkapi.generated.wall.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt
import name.alatushkin.vkapi.generated.common.objects.CommentsInfo
import name.alatushkin.vkapi.generated.common.objects.Geo
import name.alatushkin.vkapi.generated.common.objects.LikesInfo
import name.alatushkin.vkapi.generated.common.objects.RepostsInfo
import name.alatushkin.vkapi.generated.messages.objects.MessageAttachment
import name.alatushkin.vkapi.vktypes.VkDate

data class WallpostAttached(
    val id: Long? = null,
    val fromId: Long? = null,
    val toId: Long? = null,
    val date: VkDate? = null,
    val postType: PostType? = null,
    val text: String? = null,
    val canDelete: BoolInt? = null,
    val signerId: Long? = null,
    val attachments: List<WallpostAttachment>? = null,
    val geo: Geo? = null,
    val postSource: PostSource? = null,
    val comments: CommentsInfo? = null,
    val likes: LikesInfo? = null,
    val reposts: RepostsInfo? = null,
    val copyOwnerId: Long? = null,
    val copyPostId: Long? = null,
    val copyText: String? = null
) : MessageAttachment
