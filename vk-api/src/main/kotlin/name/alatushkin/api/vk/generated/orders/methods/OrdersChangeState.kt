@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.orders.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.orders.objects.ChangeStateAction
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/orders.changeState]
 *
 * Changes order status.
 *
 * @property orderId order ID.
 * @property action action to be done with the order. Available actions: *cancel — to cancel unconfirmed order. *charge — to confirm unconfirmed order. Applies only if processing of [vk.com/dev/payments_status|order_change_state] notification failed. *refund — to cancel confirmed order.
 * @property appOrderId internal ID of the order in the application.
 * @property testMode if this parameter is set to 1, this method returns a list of test mode orders. By default — 0.
 */
data class OrdersChangeState(
    var orderId: Long,
    var action: ChangeStateAction,
    var appOrderId: Long? = null
) : VkMethod<String>(
    "orders.changeState",
    jacksonTypeRef()
), UserMethod
