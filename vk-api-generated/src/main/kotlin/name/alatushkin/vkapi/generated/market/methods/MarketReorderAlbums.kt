@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/market.reorderAlbums]
 *
 * Reorders the collections list.
 *
 * @property ownerId ID of an item owner community.
 * @property albumId Collection ID.
 * @property before ID of a collection to place current collection before it.
 * @property after ID of a collection to place current collection after it.
 */
data class MarketReorderAlbums(
    var ownerId: Long,
    var albumId: Long,
    var before: Long? = null,
    var after: Long? = null
) : VkMethod<OkResponse>("market.reorderAlbums", jacksonTypeRef()),
    UserMethod
