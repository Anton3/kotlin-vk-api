@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.NameCase
import name.alatushkin.vkapi.generated.friends.objects.GetOrder
import name.alatushkin.vkapi.tokens.UserServiceMethod
import name.alatushkin.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/friends.get]
 *
 * Returns a list of user IDs or detailed information about a user's friends.
 *
 * @property userId User ID. By default, the current user ID.
 * @property order Sort order: , 'name' — by name (enabled only if the 'fields' parameter is used), 'hints' — by rating, similar to how friends are sorted in My friends section, , This parameter is available only for [vk.com/dev/standalone|desktop applications].
 * @property listId ID of the friend list returned by the [vk.com/dev/friends.getLists|friends.getLists] method to be used as the source. This parameter is taken into account only when the uid parameter is set to the current user ID. This parameter is available only for [vk.com/dev/standalone|desktop applications].
 * @property count Number of friends to return.
 * @property offset Offset needed to return a specific subset of friends.
 * @property nameCase Case for declension of user name and surname: , 'nom' — nominative (default) , 'gen' — genitive , 'dat' — dative , 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
 */
data class FriendsGet(
    var userId: Long? = null,
    var order: GetOrder? = null,
    var listId: Long? = null,
    var count: Long? = null,
    var offset: Long? = null,
    var nameCase: NameCase? = null
) : VkMethod<VkList<Long>>(
    "friends.get",
    jacksonTypeRef()
), UserServiceMethod
