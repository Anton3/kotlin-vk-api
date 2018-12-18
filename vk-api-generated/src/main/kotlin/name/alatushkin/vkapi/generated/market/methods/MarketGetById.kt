@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.market.objects.MarketItem
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/market.getById]
 *
 * Returns information about market items by their ids.
 *
 * @property itemIds Comma-separated ids list: {user id}_{item id}. If an item belongs to a community -{community id} is used. " 'Videos' value example: , '-4363_136089719,13245770_137352259'"
 */
data class MarketGetById(
    var itemIds: List<String>
) : VkMethod<VkList<MarketItem>>("market.getById", jacksonTypeRef()),
    UserMethod
