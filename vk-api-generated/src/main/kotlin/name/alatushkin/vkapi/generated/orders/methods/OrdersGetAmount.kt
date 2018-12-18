@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.orders.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.orders.objects.Amount

/**
 * [https://vk.com/dev/orders.getAmount]
 *
 * No description
 *
 * @property userId No description
 * @property votes No description
 */
data class OrdersGetAmount(
    var userId: Long,
    var votes: List<String>
) : VkMethod<Amount>("orders.getAmount", jacksonTypeRef())
