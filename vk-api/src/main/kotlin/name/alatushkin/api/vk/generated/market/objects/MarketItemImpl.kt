package name.alatushkin.api.vk.generated.market.objects

import name.alatushkin.api.vk.vktypes.VkDate

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
