@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.getRecent]
 *
 * Returns a list of user IDs of the current user's recently added friends.
 *
 * @property count Number of recently added friends to return.
 */
data class FriendsGetRecent(
    var count: Long? = null
) : VkMethod<List<Long>>(
    "friends.getRecent",
    jacksonTypeRef()
), UserMethod
