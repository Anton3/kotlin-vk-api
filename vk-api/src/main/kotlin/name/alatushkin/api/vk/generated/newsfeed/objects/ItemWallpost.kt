package name.alatushkin.api.vk.generated.newsfeed.objects

import name.alatushkin.api.vk.generated.common.objects.CommentsInfo
import name.alatushkin.api.vk.generated.common.objects.Geo
import name.alatushkin.api.vk.generated.common.objects.LikesInfo
import name.alatushkin.api.vk.generated.common.objects.RepostsInfo
import name.alatushkin.api.vk.generated.wall.objects.PostSource
import name.alatushkin.api.vk.generated.wall.objects.Wallpost
import name.alatushkin.api.vk.generated.wall.objects.WallpostAttachment
import name.alatushkin.api.vk.vktypes.VkDate

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
