@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.generated.market.objects.MarketItemFull
import name.anton3.vkapi.generated.market.objects.SearchRev
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/market.search]
 *
 * Searches market items in a community's catalog
 *
 * @property ownerId ID of an items owner community.
 * @property q Search query, for example "pink slippers".
 * @property priceFrom Minimum item price value.
 * @property priceTo Maximum item price value.
 * @property tags Comma-separated tag IDs list.
 * @property rev '0' — do not use reverse order, '1' — use reverse order
 * @property offset Offset needed to return a specific subset of results.
 * @property count Number of items to return.
 */
data class MarketSearchExtended(
    var ownerId: Int,
    var q: String? = null,
    var priceFrom: Int? = null,
    var priceTo: Int? = null,
    var tags: List<Int>? = null,
    var rev: SearchRev? = null,
    var offset: Int? = null,
    var count: Int? = null
) : VkMethod<VkList<MarketItemFull>>("market.search", jacksonTypeRef()),
    UserMethod {
    init {
        unsafeParam("extended", "1")
    }
}
