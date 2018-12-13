@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.market.objects.MarketItemFull
import name.alatushkin.api.vk.tokens.UserMethod
import name.alatushkin.api.vk.vktypes.VkList

/**
 * [https://vk.com/dev/market.get]
 *
 * Returns items list for a community.
 *
 * @property ownerId ID of an item owner community, "Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community "
 * @property count Number of items to return.
 * @property offset Offset needed to return a specific subset of results.
 */
data class MarketGetExtended(
    var ownerId: Long,
    var count: Long? = null,
    var offset: Long? = null
) : VkMethod<VkList<MarketItemFull>>(
    "market.get",
    jacksonTypeRef()
), UserMethod {
    init {
        unsafeParam("extended", "1")
    }
}
