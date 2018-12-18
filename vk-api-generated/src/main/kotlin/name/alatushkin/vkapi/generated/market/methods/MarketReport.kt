@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.market.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.common.objects.Reason
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/market.report]
 *
 * Sends a complaint to the item.
 *
 * @property ownerId ID of an item owner community.
 * @property itemId Item ID.
 * @property reason Complaint reason. Possible values: *'0' — spam,, *'1' — child porn,, *'2' — extremism,, *'3' — violence,, *'4' — drugs propaganda,, *'5' — adult materials,, *'6' — insult.
 */
data class MarketReport(
    var ownerId: Long,
    var itemId: Long,
    var reason: Reason
) : VkMethod<OkResponse>("market.report", jacksonTypeRef()),
    UserMethod
