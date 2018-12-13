@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.market.objects.MarketCategory
import name.alatushkin.api.vk.tokens.UserMethod
import name.alatushkin.api.vk.vktypes.VkList

/**
 * [https://vk.com/dev/market.getCategories]
 *
 * Returns a list of market categories.
 *
 * @property count Number of results to return.
 * @property offset Offset needed to return a specific subset of results.
 */
data class MarketGetCategories(
    var count: Long? = null,
    var offset: Long? = null
) : VkMethod<VkList<MarketCategory>>(
    "market.getCategories",
    jacksonTypeRef()
), UserMethod
