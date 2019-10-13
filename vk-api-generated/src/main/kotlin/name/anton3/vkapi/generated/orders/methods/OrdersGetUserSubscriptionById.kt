@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.orders.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.orders.objects.Subscription
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/orders.getUserSubscriptionById]
 *
 * No description
 *
 * @property userId No description
 * @property subscriptionId No description
 */
data class OrdersGetUserSubscriptionById(
    var userId: Int,
    var subscriptionId: Int
) : VkMethod<Subscription, UserServiceMethod>("orders.getUserSubscriptionById", jacksonTypeRef())
