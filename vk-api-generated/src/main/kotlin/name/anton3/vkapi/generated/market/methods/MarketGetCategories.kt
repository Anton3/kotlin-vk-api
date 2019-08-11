@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.market.objects.MarketCategory
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/market.getCategories]
 *
 * Returns a list of market categories.
 *
 * @property count Number of results to return.
 * @property offset Offset needed to return a specific subset of results.
 */
data class MarketGetCategories(
    var count: Int? = null,
    var offset: Int? = null
) : CheckedMethod<VkList<MarketCategory>, UserMethod>("market.getCategories", jacksonTypeRef())
