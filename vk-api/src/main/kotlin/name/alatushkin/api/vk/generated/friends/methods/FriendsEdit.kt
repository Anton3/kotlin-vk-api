@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

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
) : VkMethod<OkResponse>(
    "friends.edit",
    jacksonTypeRef()
), UserMethod
