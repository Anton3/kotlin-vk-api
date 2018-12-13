@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.friends.objects.AddListResponse
import name.alatushkin.vkapi.tokens.UserMethod

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
) : VkMethod<AddListResponse>(
    "friends.addList",
    jacksonTypeRef()
), UserMethod
