@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.generated.common.objects.Reason
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/market.reportComment]
 *
 * Sends a complaint to the item's comment.
 *
 * @property ownerId ID of an item owner community.
 * @property commentId Comment ID.
 * @property reason Complaint reason. Possible values: *'0' — spam,, *'1' — child porn,, *'2' — extremism,, *'3' — violence,, *'4' — drugs propaganda,, *'5' — adult materials,, *'6' — insult.
 */
data class MarketReportComment(
    var ownerId: Long,
    var commentId: Long,
    var reason: Reason
) : VkMethod<OkResponse>(
    "market.reportComment",
    jacksonTypeRef()
), UserMethod
