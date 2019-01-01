@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/market.restore]
 *
 * Restores recently deleted item
 *
 * @property ownerId ID of an item owner community.
 * @property itemId Deleted item ID.
 */
data class MarketRestore(
    var ownerId: Int,
    var itemId: Int
) : VkMethod<OkResponse>("market.restore", jacksonTypeRef()),
    UserMethod
