@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.getAppUsers]
 *
 * Returns a list of IDs of the current user's friends who installed the application.
 *

 */
class FriendsGetAppUsers : VkMethod<List<Long>>("friends.getAppUsers", jacksonTypeRef()),
    UserMethod
