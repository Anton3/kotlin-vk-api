package name.anton3.vkapi.generated.market.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.common.objects.Likes
import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property photos No description
 * @property canComment Information whether current use can comment the item
 * @property canRepost Information whether current use can repost the item
 * @property likes No description
 * @property viewsCount Views number
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
@JsonDeserialize(`as` = Void::class)
data class MarketItemFull(
    val photos: List<Photo>? = null,
    val canComment: Boolean? = null,
    val canRepost: Boolean? = null,
    val likes: Likes? = null,
    val viewsCount: Int? = null,
    override val id: Int,
    override val ownerId: Int,
    override val title: String,
    override val description: String,
    override val price: Price,
    override val category: MarketCategory,
    override val date: VkDate,
    override val thumbPhoto: String,
    override val availability: MarketItemAvailability
) : MarketItem
