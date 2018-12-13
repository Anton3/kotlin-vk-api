@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.friends.objects.DeleteResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.delete]
 *
 * Declines a friend request or deletes a user from the current user's friend list.
 *
 * @property userId ID of the user whose friend request is to be declined or who is to be deleted from the current user's friend list.
 */
data class FriendsDelete(
    var userId: Long
) : VkMethod<DeleteResponse>(
    "friends.delete",
    jacksonTypeRef()
), UserMethod
