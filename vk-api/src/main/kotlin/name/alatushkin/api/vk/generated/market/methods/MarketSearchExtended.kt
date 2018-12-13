@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.market.objects.MarketItemFull
import name.alatushkin.api.vk.generated.market.objects.SearchRev
import name.alatushkin.api.vk.tokens.UserMethod
import name.alatushkin.api.vk.vktypes.VkList

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
    var ownerId: Long,
    var q: String? = null,
    var priceFrom: Long? = null,
    var priceTo: Long? = null,
    var tags: List<Long>? = null,
    var rev: SearchRev? = null,
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<MarketItemFull>>(
    "market.search",
    jacksonTypeRef()
), UserMethod {
    init {
        unsafeParam("extended", "1")
    }
}
