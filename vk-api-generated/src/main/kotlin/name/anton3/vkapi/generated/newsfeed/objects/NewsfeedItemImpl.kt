package name.anton3.vkapi.generated.newsfeed.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property type No description
 * @property sourceId Item source ID
 * @property date Date when item has been added in Unixtime
 */
@JsonDeserialize(`as` = Void::class)
data class NewsfeedItemImpl(
    override val type: NewsfeedItemType? = null,
    override val sourceId: Long? = null,
    override val date: VkDate? = null
) : NewsfeedItem
