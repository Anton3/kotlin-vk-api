package name.alatushkin.vkapi.generated.market.objects

import name.alatushkin.vkapi.generated.messages.objects.MessageAttachment
import name.alatushkin.vkapi.generated.wall.objects.CommentAttachment
import name.alatushkin.vkapi.generated.wall.objects.WallpostAttachment
import name.alatushkin.vkapi.vktypes.VkDate

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
