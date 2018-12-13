package name.alatushkin.vkapi.generated.newsfeed.objects

import name.alatushkin.vkapi.generated.common.objects.CommentsInfo
import name.alatushkin.vkapi.generated.common.objects.LikesInfo
import name.alatushkin.vkapi.vktypes.VkDate

data class ItemTopic(
    val postId: Long,
    val text: String,
    val comments: CommentsInfo? = null,
    val likes: LikesInfo? = null,
    override val type: NewsfeedItemType? = null,
    override val sourceId: Long? = null,
    override val date: VkDate? = null
) : NewsfeedItem
