@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.market.objects.MarketAlbum
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/market.getAlbumById]
 *
 * Returns items album's data
 *
 * @property ownerId identifier of an album owner community, "Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community "
 * @property albumIds collections identifiers to obtain data from
 */
data class MarketGetAlbumById(
    var ownerId: Int,
    var albumIds: List<Int>
) : CheckedMethod<VkList<MarketAlbum>, UserMethod>("market.getAlbumById", jacksonTypeRef())
