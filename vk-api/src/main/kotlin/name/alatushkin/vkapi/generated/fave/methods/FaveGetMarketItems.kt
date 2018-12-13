@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.market.objects.MarketItem
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.VkList

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
