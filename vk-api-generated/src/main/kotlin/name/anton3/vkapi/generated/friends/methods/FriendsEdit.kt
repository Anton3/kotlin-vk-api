@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/friends.edit]
 *
 * Edits the friend lists of the selected user.
 *
 * @property userId ID of the user whose friend list is to be edited.
 * @property listIds IDs of the friend lists to which to add the user.
 */
data class FriendsEdit(
    var userId: Int,
    var listIds: List<Int>? = null
) : VkMethod<OkResponse, UserMethod>("friends.edit", jacksonTypeRef())
