@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkDate
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.generated.market.MarketItemFull
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

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
class MarketSearchMethodExtended(
    ownerId: Long,
    q: String? = null,
    priceFrom: Long? = null,
    priceTo: Long? = null,
    tags: Array<Long>? = null,
    rev: VkDate? = null,
    offset: Long? = null,
    count: Long? = null
) : VkMethod<VkList<MarketItemFull>>(
    "market.search",
    mutableMapOf("extended" to "1"),
    successReference()
), UserMethod {

    var ownerId: Long by props
    var q: String? by props
    var priceFrom: Long? by props
    var priceTo: Long? by props
    var tags: Array<Long>? by props
    var rev: VkDate? by props
    var offset: Long? by props
    var count: Long? by props

    init {
        this.ownerId = ownerId
        this.q = q
        this.priceFrom = priceFrom
        this.priceTo = priceTo
        this.tags = tags
        this.rev = rev
        this.offset = offset
        this.count = count
    }
}
