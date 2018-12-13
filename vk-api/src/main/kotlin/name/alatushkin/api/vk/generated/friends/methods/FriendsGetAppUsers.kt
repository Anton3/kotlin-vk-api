@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.getAppUsers]
 *
 * Returns a list of IDs of the current user's friends who installed the application.
 *

 */
class FriendsGetAppUsers : VkMethod<List<Long>>(
    "friends.getAppUsers",
    jacksonTypeRef()
), UserMethod
