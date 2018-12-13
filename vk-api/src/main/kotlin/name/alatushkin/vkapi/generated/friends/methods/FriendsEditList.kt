@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.tokens.UserMethod

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
    var listId: Long,
    var userIds: List<Long>? = null,
    var addUserIds: List<Long>? = null,
    var deleteUserIds: List<Long>? = null
) : VkMethod<OkResponse>(
    "friends.editList",
    jacksonTypeRef()
), UserMethod
