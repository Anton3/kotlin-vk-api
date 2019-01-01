@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.orders.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.orders.objects.Order
import name.anton3.vkapi.tokens.UserMethod

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
    var orderId: Int? = null,
    var orderIds: List<Int>? = null
) : VkMethod<List<Order>>("orders.getById", jacksonTypeRef()),
    UserMethod
