@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/market.delete]
 *
 * Deletes an item.
 *
 * @property ownerId ID of an item owner community.
 * @property itemId Item ID.
 */
data class MarketDelete(
    var ownerId: Int,
    var itemId: Int
) : CheckedMethod<OkResponse, UserMethod>("market.delete", jacksonTypeRef())
