@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property accessKey Access key for the market item
 * @property availability No description
 * @property buttonTitle Title for button for url
 * @property category No description
 * @property date Date when the item has been created in Unixtime
 * @property description Item description
 * @property externalId No description
 * @property id Item ID
 * @property isFavorite No description
 * @property ownerId Item owner's ID
 * @property price No description
 * @property thumbPhoto URL of the preview image
 * @property title Item title
 * @property url URL to item
 */
@JsonDeserialize(`as` = Void::class)
data class MarketItemImpl(
    override val accessKey: String? = null,
    override val availability: MarketItemAvailability,
    override val buttonTitle: String? = null,
    override val category: MarketCategory,
    override val date: VkDate,
    override val description: String,
    override val externalId: String? = null,
    override val id: Int,
    override val isFavorite: Boolean? = null,
    override val ownerId: Int,
    override val price: Price,
    override val thumbPhoto: String,
    override val title: String,
    override val url: String? = null
) : MarketItem
