@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.wall.objects.Wallpost
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property buttonText No description
 * @property feedId id of feed in digest
 * @property items No description
 * @property mainPostIds No description
 * @property template type of digest
 * @property title No description
 * @property trackCode No description
 * @property type No description
 * @property sourceId Item source ID
 * @property date Date when item has been added in Unixtime
 */
@JsonDeserialize(`as` = Void::class)
data class ItemDigest(
    val buttonText: String? = null,
    val feedId: String? = null,
    val items: List<Wallpost>? = null,
    val mainPostIds: List<String>? = null,
    val template: ItemDigestTemplate? = null,
    val title: String? = null,
    val trackCode: String? = null,
    override val type: NewsfeedItemType,
    override val sourceId: Int,
    override val date: VkDate
) : ItemBase, NewsfeedItem
