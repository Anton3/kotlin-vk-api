package name.alatushkin.vkapi.generated.newsfeed.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.alatushkin.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property type No description
 * @property sourceId Item source ID
 * @property date Date when item has been added in Unixtime
 */
@JsonDeserialize(`as` = NewsfeedItemImpl::class)
interface NewsfeedItem {
    val type: NewsfeedItemType?
    val sourceId: Long?
    val date: VkDate?
}
