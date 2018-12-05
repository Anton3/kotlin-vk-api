@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.orders.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.orders.ChangeStateAction
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
class OrdersChangeStateMethod(
        orderId: Long,
        action: ChangeStateAction,
        appOrderId: Long? = null,
        testMode: Boolean? = null
) : VkMethod<String>(
    "orders.changeState",
    mutableMapOf(),
    object : TypeReference<VkResponse<String>>() {}
), UserMethod {

    var orderId: Long by props
    var action: ChangeStateAction by props
    var appOrderId: Long? by props
    var testMode: Boolean? by props

    init {
        this.orderId = orderId
        this.action = action
        this.appOrderId = appOrderId
        this.testMode = testMode
    }

    fun setOrderId(orderId: Long): OrdersChangeStateMethod {
        this.orderId = orderId
        return this
    }

    fun setAction(action: ChangeStateAction): OrdersChangeStateMethod {
        this.action = action
        return this
    }

    fun setAppOrderId(appOrderId: Long): OrdersChangeStateMethod {
        this.appOrderId = appOrderId
        return this
    }

    fun setTestMode(testMode: Boolean): OrdersChangeStateMethod {
        this.testMode = testMode
        return this
    }
}
