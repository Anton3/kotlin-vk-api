@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.market.objects.MarketItem
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/market.get]
 *
 * Returns items list for a community.
 *
 * @property ownerId ID of an item owner community, "Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community "
 * @property count Number of items to return.
 * @property offset Offset needed to return a specific subset of results.
 */
data class MarketGet(
    var ownerId: Long,
    var count: Long? = null,
    var offset: Long? = null
) : VkMethod<VkList<MarketItem>>("market.get", jacksonTypeRef()),
    UserMethod
