package name.alatushkin.api.vk.generated.newsfeed.objects

import name.alatushkin.api.vk.generated.common.objects.CommentsInfo
import name.alatushkin.api.vk.generated.common.objects.LikesInfo
import name.alatushkin.api.vk.vktypes.VkDate

data class ItemTopic(
    val postId: Long,
    val text: String,
    val comments: CommentsInfo? = null,
    val likes: LikesInfo? = null,
    override val type: NewsfeedItemType? = null,
    override val sourceId: Long? = null,
    override val date: VkDate? = null
) : NewsfeedItem
