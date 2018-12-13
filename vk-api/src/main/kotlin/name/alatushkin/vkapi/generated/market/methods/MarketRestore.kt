@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/market.restore]
 *
 * Restores recently deleted item
 *
 * @property ownerId ID of an item owner community.
 * @property itemId Deleted item ID.
 */
data class MarketRestore(
    var ownerId: Long,
    var itemId: Long
) : VkMethod<OkResponse>(
    "market.restore",
    jacksonTypeRef()
), UserMethod
