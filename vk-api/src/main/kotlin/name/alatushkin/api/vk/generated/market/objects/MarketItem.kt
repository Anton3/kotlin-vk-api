package name.alatushkin.api.vk.generated.market.objects

import name.alatushkin.api.vk.generated.messages.objects.MessageAttachment
import name.alatushkin.api.vk.generated.wall.objects.CommentAttachment
import name.alatushkin.api.vk.generated.wall.objects.WallpostAttachment
import name.alatushkin.api.vk.vktypes.VkDate

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
