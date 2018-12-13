package name.alatushkin.api.vk.generated.wall.objects

import name.alatushkin.api.vk.generated.common.objects.CommentsInfo
import name.alatushkin.api.vk.generated.common.objects.Geo
import name.alatushkin.api.vk.generated.common.objects.LikesInfo
import name.alatushkin.api.vk.generated.common.objects.RepostsInfo
import name.alatushkin.api.vk.generated.notifications.objects.NotificationParent
import name.alatushkin.api.vk.vktypes.VkDate

data class WallpostToId(
    val id: Long? = null,
    val fromId: Long? = null,
    val toId: Long? = null,
    val date: VkDate? = null,
    val postId: Long? = null,
    val postType: PostType? = null,
    val text: String? = null,
    val signerId: Long? = null,
    val attachments: List<WallpostAttachment>? = null,
    val geo: Geo? = null,
    val postSource: PostSource? = null,
    val comments: CommentsInfo? = null,
    val likes: LikesInfo? = null,
    val reposts: RepostsInfo? = null,
    val copyOwnerId: Long? = null,
    val copyPostId: Long? = null
) : NotificationParent
