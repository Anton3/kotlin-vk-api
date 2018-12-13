@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.orders.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.orders.objects.Order
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/orders.get]
 *
 * Returns a list of orders.
 *
 * @property count number of returned orders.
 * @property testMode if this parameter is set to 1, this method returns a list of test mode orders. By default — 0.
 */
data class OrdersGet(
    var count: Long? = null
) : VkMethod<List<Order>>(
    "orders.get",
    jacksonTypeRef()
), UserMethod
