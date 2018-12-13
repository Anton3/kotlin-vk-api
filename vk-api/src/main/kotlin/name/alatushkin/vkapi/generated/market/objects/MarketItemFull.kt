package name.alatushkin.vkapi.generated.market.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt
import name.alatushkin.vkapi.generated.common.objects.Likes
import name.alatushkin.vkapi.generated.photos.objects.Photo
import name.alatushkin.vkapi.vktypes.VkDate

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
