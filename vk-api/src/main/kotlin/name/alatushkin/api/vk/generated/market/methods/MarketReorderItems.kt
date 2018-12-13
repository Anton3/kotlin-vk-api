@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

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
    var ownerId: Long,
    var albumId: Long? = null,
    var itemId: Long,
    var before: Long? = null,
    var after: Long? = null
) : VkMethod<OkResponse>(
    "market.reorderItems",
    jacksonTypeRef()
), UserMethod
