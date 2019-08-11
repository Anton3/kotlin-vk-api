@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.orders.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.orders.objects.Amount
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.MethodRequirement

/**
 * [https://vk.com/dev/orders.getAmount]
 *
 * No description
 *
 * @property userId No description
 * @property votes No description
 */
data class OrdersGetAmount(
    var userId: Int,
    var votes: List<String>
) : CheckedMethod<Amount, MethodRequirement>("orders.getAmount", jacksonTypeRef())
