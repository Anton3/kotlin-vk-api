@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/market.delete]
 *
 * Deletes an item.
 *
 * @property ownerId ID of an item owner community.
 * @property itemId Item ID.
 */
data class MarketDelete(
    var ownerId: Long,
    var itemId: Long
) : VkMethod<OkResponse>(
    "market.delete",
    jacksonTypeRef()
), UserMethod
