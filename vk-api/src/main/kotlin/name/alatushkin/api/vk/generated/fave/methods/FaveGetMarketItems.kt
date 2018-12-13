@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.market.objects.MarketItem
import name.alatushkin.api.vk.tokens.UserMethod
import name.alatushkin.api.vk.vktypes.VkList

/**
 * [https://vk.com/dev/fave.getMarketItems]
 *
 * Returns market items bookmarked by current user.
 *
 * @property count Number of results to return.
 * @property extended '1' – to return additional fields 'likes, can_comment, can_repost, photos'. By default: '0'.
 */
data class FaveGetMarketItems(
    var count: Long? = null,
    var extended: Boolean? = null
) : VkMethod<VkList<MarketItem>>(
    "fave.getMarketItems",
    jacksonTypeRef()
), UserMethod
