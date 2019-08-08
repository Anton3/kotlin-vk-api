@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/friends.editList]
 *
 * Edits a friend list of the current user.
 *
 * @property name Name of the friend list.
 * @property listId Friend list ID.
 * @property userIds IDs of users in the friend list.
 * @property addUserIds (Applies if 'user_ids' parameter is not set.), User IDs to add to the friend list.
 * @property deleteUserIds (Applies if 'user_ids' parameter is not set.), User IDs to delete from the friend list.
 */
data class FriendsEditList(
    var name: String? = null,
    var listId: Int,
    var userIds: List<Int>? = null,
    var addUserIds: List<Int>? = null,
    var deleteUserIds: List<Int>? = null
) : VkMethod<OkResponse>("friends.editList", jacksonTypeRef()),
    UserMethod
