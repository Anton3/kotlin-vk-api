@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
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
) : VkMethod<OkResponse>("market.addToAlbum", jacksonTypeRef()),
    UserMethod
