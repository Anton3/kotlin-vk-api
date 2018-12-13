package name.alatushkin.vkapi.generated.wall.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt
import name.alatushkin.vkapi.generated.common.objects.CommentsInfo
import name.alatushkin.vkapi.generated.common.objects.Geo
import name.alatushkin.vkapi.generated.common.objects.LikesInfo
import name.alatushkin.vkapi.generated.common.objects.RepostsInfo
import name.alatushkin.vkapi.vktypes.VkDate

data class WallpostFull(
    val copyHistory: List<Wallpost>? = null,
    val canEdit: BoolInt? = null,
    val createdBy: Long? = null,
    val canDelete: BoolInt? = null,
    val canPin: BoolInt? = null,
    val isPinned: Long? = null,
    val comments: CommentsInfo? = null,
    val likes: LikesInfo? = null,
    val reposts: RepostsInfo? = null,
    val markedAsAds: BoolInt? = null,
    override val id: Long? = null,
    override val fromId: Long? = null,
    override val ownerId: Long? = null,
    override val date: VkDate? = null,
    override val views: Views? = null,
    override val accessKey: String? = null,
    override val postType: PostType? = null,
    override val text: String? = null,
    override val signerId: Long? = null,
    override val attachments: List<WallpostAttachment>? = null,
    override val geo: Geo? = null,
    override val postSource: PostSource? = null
) : Wallpost
