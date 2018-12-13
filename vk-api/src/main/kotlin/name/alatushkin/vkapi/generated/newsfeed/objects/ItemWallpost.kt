package name.alatushkin.vkapi.generated.newsfeed.objects

import name.alatushkin.vkapi.generated.common.objects.CommentsInfo
import name.alatushkin.vkapi.generated.common.objects.Geo
import name.alatushkin.vkapi.generated.common.objects.LikesInfo
import name.alatushkin.vkapi.generated.common.objects.RepostsInfo
import name.alatushkin.vkapi.generated.wall.objects.PostSource
import name.alatushkin.vkapi.generated.wall.objects.Wallpost
import name.alatushkin.vkapi.generated.wall.objects.WallpostAttachment
import name.alatushkin.vkapi.vktypes.VkDate

data class ItemWallpost(
    val postId: Long? = null,
    val postType: ItemWallpostType? = null,
    val text: String? = null,
    val copyHistory: List<Wallpost>? = null,
    val attachments: List<WallpostAttachment>? = null,
    val geo: Geo? = null,
    val postSource: PostSource? = null,
    val comments: CommentsInfo? = null,
    val likes: LikesInfo? = null,
    val reposts: RepostsInfo? = null,
    override val type: NewsfeedItemType? = null,
    override val sourceId: Long? = null,
    override val date: VkDate? = null
) : NewsfeedItem
