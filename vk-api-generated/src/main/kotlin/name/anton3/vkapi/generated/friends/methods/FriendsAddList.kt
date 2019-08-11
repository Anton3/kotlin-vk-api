@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.friends.objects.AddListResponse
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/friends.addList]
 *
 * Creates a new friend list for the current user.
 *
 * @property name Name of the friend list.
 * @property userIds IDs of users to be added to the friend list.
 */
data class FriendsAddList(
    var name: String,
    var userIds: List<Int>? = null
) : CheckedMethod<AddListResponse, UserMethod>("friends.addList", jacksonTypeRef())
