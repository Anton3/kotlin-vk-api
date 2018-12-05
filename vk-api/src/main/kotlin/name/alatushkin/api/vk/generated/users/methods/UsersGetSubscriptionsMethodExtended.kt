@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.users.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.users.GetSubscriptionsExtendedResponse
import name.alatushkin.api.vk.tokens.UserServiceMethod

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
class UsersGetSubscriptionsMethodExtended(
        userId: Long? = null,
        offset: Long? = null,
        count: Long? = null,
        fields: Array<String>? = null
) : VkMethod<VkList<GetSubscriptionsExtendedResponse>>(
    "users.getSubscriptions",
    mutableMapOf("extended" to "1"),
    object : TypeReference<VkResponse<VkList<GetSubscriptionsExtendedResponse>>>() {}
), UserServiceMethod {

    var userId: Long? by props
    var offset: Long? by props
    var count: Long? by props
    var fields: Array<String>? by props

    init {
        this.userId = userId
        this.offset = offset
        this.count = count
        this.fields = fields
    }

    fun setUserId(userId: Long): UsersGetSubscriptionsMethodExtended {
        this.userId = userId
        return this
    }

    fun setOffset(offset: Long): UsersGetSubscriptionsMethodExtended {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): UsersGetSubscriptionsMethodExtended {
        this.count = count
        return this
    }

    fun setFields(fields: Array<String>): UsersGetSubscriptionsMethodExtended {
        this.fields = fields
        return this
    }
}
