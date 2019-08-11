@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/friends.getAppUsers]
 *
 * Returns a list of IDs of the current user's friends who installed the application.
 *

 */
class FriendsGetAppUsers : CheckedMethod<List<Int>, UserMethod>("friends.getAppUsers", jacksonTypeRef())
