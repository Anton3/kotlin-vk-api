@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/market.deleteAlbum]
 *
 * Deletes a collection of items.
 *
 * @property ownerId ID of an collection owner community.
 * @property albumId Collection ID.
 */
data class MarketDeleteAlbum(
    var ownerId: Long,
    var albumId: Long
) : VkMethod<OkResponse>("market.deleteAlbum", jacksonTypeRef()),
    UserMethod
