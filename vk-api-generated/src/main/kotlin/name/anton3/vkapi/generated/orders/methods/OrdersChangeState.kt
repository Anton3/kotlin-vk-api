@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.orders.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.orders.objects.ChangeStateAction
import name.anton3.vkapi.tokens.UserMethod

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
    var orderId: Int,
    var action: ChangeStateAction,
    var appOrderId: Int? = null
) : VkMethod<String>("orders.changeState", jacksonTypeRef()),
    UserMethod
