@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.users.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.generated.users.objects.GetSubscriptionsExtendedResponse
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/users.getSubscriptions]
 *
 * Returns a list of IDs of users and communities followed by the user.
 *
 * @property userId User ID.
 * @property offset Offset needed to return a specific subset of subscriptions.
 * @property count Number of users and communities to return.
 * @property fields No description
 */
data class UsersGetSubscriptionsExtended(
    var userId: Int? = null,
    var offset: Int? = null,
    var count: Int? = null,
    var fields: List<String>? = null
) : VkMethod<VkList<GetSubscriptionsExtendedResponse>>("users.getSubscriptions", jacksonTypeRef()),
    UserServiceMethod {
    init {
        unsafeParam("extended", "1")
    }
}
