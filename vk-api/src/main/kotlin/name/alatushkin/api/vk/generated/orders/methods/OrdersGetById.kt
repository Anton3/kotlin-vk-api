@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.orders.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.orders.objects.Order
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/orders.getById]
 *
 * Returns information about orders by their IDs.
 *
 * @property orderId order ID.
 * @property orderIds order IDs (when information about several orders is requested).
 * @property testMode if this parameter is set to 1, this method returns a list of test mode orders. By default — 0.
 */
data class OrdersGetById(
    var orderId: Long? = null,
    var orderIds: List<Long>? = null
) : VkMethod<List<Order>>(
    "orders.getById",
    jacksonTypeRef()
), UserMethod
