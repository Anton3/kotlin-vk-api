@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.market.objects.MarketItemFull
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/market.getById]
 *
 * Returns information about market items by their ids.
 *
 * @property itemIds Comma-separated ids list: {user id}_{item id}. If an item belongs to a community -{community id} is used. " 'Videos' value example: , '-4363_136089719,13245770_137352259'"
 */
data class MarketGetByIdExtended(
    var itemIds: List<String>
) : VkMethod<VkList<MarketItemFull>, UserMethod>("market.getById", jacksonTypeRef()) {
    init {
        unsafeParam("extended", "1")
    }
}
