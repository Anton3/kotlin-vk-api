@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.market.objects.MarketAlbum
import name.alatushkin.api.vk.tokens.UserMethod
import name.alatushkin.api.vk.vktypes.VkList

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
    var ownerId: Long,
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<MarketAlbum>>(
    "market.getAlbums",
    jacksonTypeRef()
), UserMethod
