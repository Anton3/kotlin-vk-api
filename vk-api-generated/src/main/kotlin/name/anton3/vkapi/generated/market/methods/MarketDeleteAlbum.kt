@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
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
    var ownerId: Int,
    var albumId: Int
) : VkMethod<OkResponse, UserMethod>("market.deleteAlbum", jacksonTypeRef())
