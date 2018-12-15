@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/friends.edit]
 *
 * Edits the friend lists of the selected user.
 *
 * @property userId ID of the user whose friend list is to be edited.
 * @property listIds IDs of the friend lists to which to add the user.
 */
data class FriendsEdit(
    var userId: Long,
    var listIds: List<Long>? = null
) : VkMethod<OkResponse>("friends.edit", jacksonTypeRef()),
    UserMethod
