package name.alatushkin.vkapi.generated.market.objects

import name.alatushkin.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property id Item ID
 * @property ownerId Item owner's ID
 * @property title Item title
 * @property description Item description
 * @property price No description
 * @property category No description
 * @property date Date when the item has been created in Unixtime
 * @property thumbPhoto URL of the preview image
 * @property availability No description
 */
data class MarketItemImpl(
    override val id: Long,
    override val ownerId: Long,
    override val title: String,
    override val description: String,
    override val price: Price,
    override val category: MarketCategory,
    override val date: VkDate,
    override val thumbPhoto: String,
    override val availability: MarketItemAvailability
) : MarketItem
