@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.generated.friends.FriendStatus
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.areFriends]
 *
 * Checks the current user's friendship status with other specified users.
 *
 * @property userIds IDs of the users whose friendship status to check.
 * @property needSign '1' — to return 'sign' field. 'sign' is md5("{id}_{user_id}_{friends_status}_{application_secret}"), where id is current user ID. This field allows to check that data has not been modified by the client. By default: '0'.
 */
class FriendsAreFriendsMethod(
    userIds: Array<Long>,
    needSign: Boolean? = null
) : VkMethod<Array<FriendStatus>>(
    "friends.areFriends",
    mutableMapOf(),
    successReference()
), UserMethod {

    var userIds: Array<Long> by props
    var needSign: Boolean? by props

    init {
        this.userIds = userIds
        this.needSign = needSign
    }
}
