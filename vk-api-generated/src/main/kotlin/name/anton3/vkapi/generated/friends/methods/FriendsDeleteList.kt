@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/friends.deleteList]
 *
 * Deletes a friend list of the current user.
 *
 * @property listId ID of the friend list to delete.
 */
data class FriendsDeleteList(
    var listId: Int
) : VkMethod<OkResponse>("friends.deleteList", jacksonTypeRef()),
    UserMethod
