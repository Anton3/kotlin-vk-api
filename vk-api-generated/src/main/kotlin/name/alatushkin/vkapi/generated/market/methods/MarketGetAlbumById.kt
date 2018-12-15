@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.market.objects.MarketAlbum
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/market.getAlbumById]
 *
 * Returns items album's data
 *
 * @property ownerId identifier of an album owner community, "Note that community id in the 'owner_id' parameter should be negative number. For example 'owner_id'=-1 matches the [vk.com/apiclub|VK API] community "
 * @property albumIds collections identifiers to obtain data from
 */
data class MarketGetAlbumById(
    var ownerId: Long,
    var albumIds: List<Long>
) : VkMethod<VkList<MarketAlbum>>("market.getAlbumById", jacksonTypeRef()),
    UserMethod
