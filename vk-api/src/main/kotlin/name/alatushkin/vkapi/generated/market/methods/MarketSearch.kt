@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.market.objects.MarketItem
import name.alatushkin.vkapi.generated.market.objects.SearchRev
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.VkList

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
data class MarketSearch(
    var ownerId: Long,
    var q: String? = null,
    var priceFrom: Long? = null,
    var priceTo: Long? = null,
    var tags: List<Long>? = null,
    var rev: SearchRev? = null,
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<MarketItem>>(
    "market.search",
    jacksonTypeRef()
), UserMethod
