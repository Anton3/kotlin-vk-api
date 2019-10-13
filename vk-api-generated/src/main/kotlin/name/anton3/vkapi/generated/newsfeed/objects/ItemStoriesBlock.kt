@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.stories.objects.Story
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property blockType No description
 * @property stories No description
 * @property title No description
 * @property trackCode No description
 * @property type No description
 * @property sourceId Item source ID
 * @property date Date when item has been added in Unixtime
 */
@JsonDeserialize(`as` = Void::class)
data class ItemStoriesBlock(
    val blockType: ItemStoriesBlockBlockType? = null,
    val stories: List<Story>? = null,
    val title: String? = null,
    val trackCode: String? = null,
    override val type: NewsfeedItemType,
    override val sourceId: Int,
    override val date: VkDate
) : ItemBase, NewsfeedItem
