package name.anton3.vkapi.generated.newsfeed.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.common.objects.CommentsInfo
import name.anton3.vkapi.generated.common.objects.Geo
import name.anton3.vkapi.generated.common.objects.LikesInfo
import name.anton3.vkapi.generated.common.objects.RepostsInfo
import name.anton3.vkapi.generated.wall.objects.PostSource
import name.anton3.vkapi.generated.wall.objects.Wallpost
import name.anton3.vkapi.generated.wall.objects.WallpostAttachment
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property postId Post ID
 * @property postType No description
 * @property text Post text
 * @property copyHistory No description
 * @property attachments No description
 * @property geo No description
 * @property postSource No description
 * @property comments No description
 * @property likes No description
 * @property reposts No description
 * @property type No description
 * @property sourceId Item source ID
 * @property date Date when item has been added in Unixtime
 */
@JsonDeserialize(`as` = Void::class)
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
