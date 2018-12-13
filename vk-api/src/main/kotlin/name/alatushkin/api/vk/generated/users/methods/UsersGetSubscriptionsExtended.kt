@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.users.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.users.objects.GetSubscriptionsExtendedResponse
import name.alatushkin.api.vk.tokens.UserServiceMethod
import name.alatushkin.api.vk.vktypes.VkList

/**
 * [https://vk.com/dev/users.getSubscriptions]
 *
 * Returns a list of IDs of users and communities followed by the user.
 *
 * @property userId User ID.
 * @property offset Offset needed to return a specific subset of subscriptions.
 * @property count Number of users and communities to return.
 * @property fields 
 */
data class UsersGetSubscriptionsExtended(
    var userId: Long? = null,
    var offset: Long? = null,
    var count: Long? = null,
    var fields: List<String>? = null
) : VkMethod<VkList<GetSubscriptionsExtendedResponse>>(
    "users.getSubscriptions",
    jacksonTypeRef()
), UserServiceMethod {
    init {
        unsafeParam("extended", "1")
    }
}
