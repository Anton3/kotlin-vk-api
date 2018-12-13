package name.alatushkin.vkapi.generated.market.objects

import name.alatushkin.vkapi.vktypes.VkDate

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
