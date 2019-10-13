@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.orders.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.BoolInt

/**
 * [https://vk.com/dev/orders.cancelSubscription]
 *
 * No description
 *
 * @property userId No description
 * @property subscriptionId No description
 * @property pendingCancel No description
 */
data class OrdersCancelSubscription(
    var userId: Int,
    var subscriptionId: Int,
    var pendingCancel: Boolean? = null
) : VkMethod<BoolInt, UserServiceMethod>("orders.cancelSubscription", jacksonTypeRef())
