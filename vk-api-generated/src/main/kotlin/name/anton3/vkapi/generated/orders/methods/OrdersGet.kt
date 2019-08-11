@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.orders.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.orders.objects.Order
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/orders.get]
 *
 * Returns a list of orders.
 *
 * @property count number of returned orders.
 * @property testMode if this parameter is set to 1, this method returns a list of test mode orders. By default — 0.
 */
data class OrdersGet(
    var count: Int? = null
) : CheckedMethod<List<Order>, UserMethod>("orders.get", jacksonTypeRef())
