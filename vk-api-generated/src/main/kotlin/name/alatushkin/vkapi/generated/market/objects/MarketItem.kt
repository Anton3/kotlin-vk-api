package name.alatushkin.vkapi.generated.market.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.alatushkin.vkapi.generated.messages.objects.MessageAttachment
import name.alatushkin.vkapi.generated.wall.objects.CommentAttachment
import name.alatushkin.vkapi.generated.wall.objects.WallpostAttachment
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
@JsonDeserialize(`as` = MarketItemImpl::class)
interface MarketItem : WallpostAttachment,
    CommentAttachment,
    MessageAttachment {

    val id: Long
    val ownerId: Long
    val title: String
    val description: String
    val price: Price
    val category: MarketCategory
    val date: VkDate
    val thumbPhoto: String
    val availability: MarketItemAvailability
}
