@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.common.objects.CommentsInfo
import name.anton3.vkapi.generated.common.objects.LikesInfo
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property comments No description
 * @property likes No description
 * @property postId Topic post ID
 * @property text Post text
 * @property type No description
 * @property sourceId Item source ID
 * @property date Date when item has been added in Unixtime
 */
@JsonDeserialize(`as` = Void::class)
data class ItemTopic(
    val comments: CommentsInfo? = null,
    val likes: LikesInfo? = null,
    val postId: Int,
    val text: String,
    override val type: NewsfeedItemType,
    override val sourceId: Int,
    override val date: VkDate
) : ItemBase, NewsfeedItem
