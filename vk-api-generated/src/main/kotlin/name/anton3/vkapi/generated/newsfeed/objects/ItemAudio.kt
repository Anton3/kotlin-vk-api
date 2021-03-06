@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property audio No description
 * @property postId Post ID
 * @property type No description
 * @property sourceId Item source ID
 * @property date Date when item has been added in Unixtime
 */
@JsonDeserialize(`as` = Void::class)
data class ItemAudio(
    val audio: ItemAudioAudio? = null,
    val postId: Int? = null,
    override val type: NewsfeedItemType,
    override val sourceId: Int,
    override val date: VkDate
) : ItemBase, NewsfeedItem
