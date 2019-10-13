@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.messages.objects.MessageAttachmentBody
import name.anton3.vkapi.generated.wall.objects.CommentAttachmentBody
import name.anton3.vkapi.generated.wall.objects.WallPostAttachmentBody
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
@JsonDeserialize(`as` = MarketItemImpl::class)
interface MarketItem : CommentAttachmentBody, WallPostAttachmentBody, MessageAttachmentBody {
    val accessKey: String?
    val availability: MarketItemAvailability
    val buttonTitle: String?
    val category: MarketCategory
    val date: VkDate
    val description: String
    val externalId: String?
    val id: Int
    val isFavorite: Boolean?
    val ownerId: Int
    val price: Price
    val thumbPhoto: String
    val title: String
    val url: String?
}
