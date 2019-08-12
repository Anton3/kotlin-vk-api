@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/market.reorderItems]
 *
 * Changes item place in a collection.
 *
 * @property ownerId ID of an item owner community.
 * @property albumId ID of a collection to reorder items in. Set 0 to reorder full items list.
 * @property itemId Item ID.
 * @property before ID of an item to place current item before it.
 * @property after ID of an item to place current item after it.
 */
data class MarketReorderItems(
    var ownerId: Int,
    var albumId: Int? = null,
    var itemId: Int,
    var before: Int? = null,
    var after: Int? = null
) : VkMethod<OkResponse, UserMethod>("market.reorderItems", jacksonTypeRef())
