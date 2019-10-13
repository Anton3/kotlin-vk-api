@file:Suppress("unused", "SpellCheckingInspection")

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
 * @property activity No description
 * @property attachments No description
 * @property comments No description
 * @property copyHistory No description
 * @property geo No description
 * @property likes No description
 * @property postId Post ID
 * @property postSource No description
 * @property postType No description
 * @property reposts No description
 * @property text Post text
 * @property type No description
 * @property sourceId Item source ID
 * @property date Date when item has been added in Unixtime
 */
@JsonDeserialize(`as` = Void::class)
data class ItemWallpost(
    val activity: EventActivity? = null,
    val attachments: List<WallpostAttachment>? = null,
    val comments: CommentsInfo? = null,
    val copyHistory: List<Wallpost>? = null,
    val geo: Geo? = null,
    val likes: LikesInfo? = null,
    val postId: Int? = null,
    val postSource: PostSource? = null,
    val postType: ItemWallpostType? = null,
    val reposts: RepostsInfo? = null,
    val text: String? = null,
    override val type: NewsfeedItemType,
    override val sourceId: Int,
    override val date: VkDate
) : ItemBase, NewsfeedItem
