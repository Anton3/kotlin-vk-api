@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.friends.objects.FriendStatus
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.areFriends]
 *
 * Checks the current user's friendship status with other specified users.
 *
 * @property userIds IDs of the users whose friendship status to check.
 * @property needSign '1' — to return 'sign' field. 'sign' is md5("{id}_{user_id}_{friends_status}_{application_secret}"), where id is current user ID. This field allows to check that data has not been modified by the client. By default: '0'.
 */
data class FriendsAreFriends(
    var userIds: List<Long>,
    var needSign: Boolean? = null
) : VkMethod<List<FriendStatus>>(
    "friends.areFriends",
    jacksonTypeRef()
), UserMethod
