@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.friends.objects.FriendsList
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/friends.getLists]
 *
 * Returns a list of the user's friend lists.
 *
 * @property userId User ID.
 * @property returnSystem '1' — to return system friend lists. By default: '0'.
 */
data class FriendsGetLists(
    var userId: Int? = null,
    var returnSystem: Boolean? = null
) : VkMethod<VkList<FriendsList>, UserMethod>("friends.getLists", jacksonTypeRef())
