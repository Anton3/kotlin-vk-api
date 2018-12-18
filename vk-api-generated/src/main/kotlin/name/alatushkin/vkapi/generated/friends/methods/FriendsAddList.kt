@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.friends.objects.AddListResponse
import name.anton3.vkapi.tokens.UserMethod

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
    var userIds: List<Long>? = null
) : VkMethod<AddListResponse>("friends.addList", jacksonTypeRef()),
    UserMethod
