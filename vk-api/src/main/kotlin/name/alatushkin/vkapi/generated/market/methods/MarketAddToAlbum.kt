@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.tokens.UserMethod

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
    var ownerId: Long,
    var itemId: Long,
    var albumIds: List<Long>
) : VkMethod<OkResponse>(
    "market.addToAlbum",
    jacksonTypeRef()
), UserMethod
