@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.friends.objects.FriendsList
import name.alatushkin.api.vk.tokens.UserMethod
import name.alatushkin.api.vk.vktypes.VkList

/**
 * [https://vk.com/dev/friends.getLists]
 *
 * Returns a list of the user's friend lists.
 *
 * @property userId User ID.
 * @property returnSystem '1' — to return system friend lists. By default: '0'.
 */
data class FriendsGetLists(
    var userId: Long? = null,
    var returnSystem: Boolean? = null
) : VkMethod<VkList<FriendsList>>(
    "friends.getLists",
    jacksonTypeRef()
), UserMethod
