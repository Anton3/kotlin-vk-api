@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.orders.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.orders.objects.Subscription
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/orders.getUserSubscriptions]
 *
 * No description
 *
 * @property userId No description
 */
data class OrdersGetUserSubscriptions(
    var userId: Int
) : VkMethod<VkList<Subscription>, UserServiceMethod>("orders.getUserSubscriptions", jacksonTypeRef())
