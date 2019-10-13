@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.orders.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.orders.objects.Order
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/orders.get]
 *
 * Returns a list of orders.
 *
 * @property offset No description
 * @property count number of returned orders.
 * @property testMode if this parameter is set to 1, this method returns a list of test mode orders. By default — 0.
 */
data class OrdersGet(
    var offset: Int? = null,
    var count: Int? = null
) : VkMethod<List<Order>, UserServiceMethod>("orders.get", jacksonTypeRef())
