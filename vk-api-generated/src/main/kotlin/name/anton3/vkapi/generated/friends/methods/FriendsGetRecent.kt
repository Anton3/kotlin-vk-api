@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/friends.getRecent]
 *
 * Returns a list of user IDs of the current user's recently added friends.
 *
 * @property count Number of recently added friends to return.
 */
data class FriendsGetRecent(
    var count: Int? = null
) : CheckedMethod<List<Int>, UserMethod>("friends.getRecent", jacksonTypeRef())
