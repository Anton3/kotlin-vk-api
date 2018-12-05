@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.common.Reason
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/market.report]
 *
 * Sends a complaint to the item.
 *
 * @property ownerId ID of an item owner community.
 * @property itemId Item ID.
 * @property reason Complaint reason. Possible values: *'0' — spam,, *'1' — child porn,, *'2' — extremism,, *'3' — violence,, *'4' — drugs propaganda,, *'5' — adult materials,, *'6' — insult.
 */
class MarketReportMethod(
        ownerId: Long,
        itemId: Long,
        reason: Reason
) : VkMethod<Boolean>(
    "market.report",
    mutableMapOf(),
    object : TypeReference<VkResponse<Boolean>>() {}
), UserMethod {

    var ownerId: Long by props
    var itemId: Long by props
    var reason: Reason by props

    init {
        this.ownerId = ownerId
        this.itemId = itemId
        this.reason = reason
    }

    fun setOwnerId(ownerId: Long): MarketReportMethod {
        this.ownerId = ownerId
        return this
    }

    fun setItemId(itemId: Long): MarketReportMethod {
        this.itemId = itemId
        return this
    }

    fun setReason(reason: Reason): MarketReportMethod {
        this.reason = reason
        return this
    }
}
