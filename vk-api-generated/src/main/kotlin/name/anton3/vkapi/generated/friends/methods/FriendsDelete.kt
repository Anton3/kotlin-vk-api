@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.friends.objects.DeleteResponse
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.delete]
 *
 * Declines a friend request or deletes a user from the current user's friend list.
 *
 * @property userId ID of the user whose friend request is to be declined or who is to be deleted from the current user's friend list.
 */
data class FriendsDelete(
    var userId: Int
) : VkMethod<DeleteResponse>("friends.delete", jacksonTypeRef()),
    UserMethod
