@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.orders.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.BoolInt

/**
 * [https://vk.com/dev/orders.updateSubscription]
 *
 * No description
 *
 * @property userId No description
 * @property subscriptionId No description
 * @property price No description
 */
data class OrdersUpdateSubscription(
    var userId: Int,
    var subscriptionId: Int,
    var price: Int
) : VkMethod<BoolInt, UserServiceMethod>("orders.updateSubscription", jacksonTypeRef())
