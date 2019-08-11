@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/market.addToAlbum]
 *
 * Adds an item to one or multiple collections.
 *
 * @property ownerId ID of an item owner community.
 * @property itemId Item ID.
 * @property albumIds Collections IDs to add item to.
 */
data class MarketAddToAlbum(
    var ownerId: Int,
    var itemId: Int,
    var albumIds: List<Int>
) : CheckedMethod<OkResponse, UserMethod>("market.addToAlbum", jacksonTypeRef())
