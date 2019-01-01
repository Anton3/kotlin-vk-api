@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.common.objects.Reason
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

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
    var ownerId: Int,
    var commentId: Int,
    var reason: Reason
) : VkMethod<OkResponse>("market.reportComment", jacksonTypeRef()),
    UserMethod
