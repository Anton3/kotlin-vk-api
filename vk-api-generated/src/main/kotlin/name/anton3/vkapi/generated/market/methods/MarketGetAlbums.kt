@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.market.objects.MarketAlbum
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/market.getAlbums]
 *
 * Returns community's collections list.
 *
 * @property ownerId ID of an items owner community.
 * @property offset Offset needed to return a specific subset of results.
 * @property count Number of items to return.
 */
data class MarketGetAlbums(
    var ownerId: Int,
    var offset: Int? = null,
    var count: Int? = null
) : VkMethod<VkList<MarketAlbum>>("market.getAlbums", jacksonTypeRef()),
    UserMethod
