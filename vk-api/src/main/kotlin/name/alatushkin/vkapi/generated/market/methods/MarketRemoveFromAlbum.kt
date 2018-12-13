@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/market.removeFromAlbum]
 *
 * Removes an item from one or multiple collections.
 *
 * @property ownerId ID of an item owner community.
 * @property itemId Item ID.
 * @property albumIds Collections IDs to remove item from.
 */
data class MarketRemoveFromAlbum(
    var ownerId: Long,
    var itemId: Long,
    var albumIds: List<Long>
) : VkMethod<OkResponse>(
    "market.removeFromAlbum",
    jacksonTypeRef()
), UserMethod
