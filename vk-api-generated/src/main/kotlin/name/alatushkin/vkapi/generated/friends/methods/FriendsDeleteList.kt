@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/friends.deleteList]
 *
 * Deletes a friend list of the current user.
 *
 * @property listId ID of the friend list to delete.
 */
data class FriendsDeleteList(
    var listId: Long
) : VkMethod<OkResponse>("friends.deleteList", jacksonTypeRef()),
    UserMethod
