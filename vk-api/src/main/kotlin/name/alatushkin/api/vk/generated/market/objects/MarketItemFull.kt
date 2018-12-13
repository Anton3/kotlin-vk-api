package name.alatushkin.api.vk.generated.market.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt
import name.alatushkin.api.vk.generated.common.objects.Likes
import name.alatushkin.api.vk.generated.photos.objects.Photo
import name.alatushkin.api.vk.vktypes.VkDate

data class MarketItemFull(
    val photos: List<Photo>? = null,
    val canComment: BoolInt? = null,
    val canRepost: BoolInt? = null,
    val likes: Likes? = null,
    val viewsCount: Long? = null,
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
