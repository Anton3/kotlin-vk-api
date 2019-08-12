@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.common.objects.NameCase
import name.anton3.vkapi.generated.friends.objects.GetOrder
import name.anton3.vkapi.generated.friends.objects.UserXtrLists
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkList

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
 * @property fields Profile fields to return. Sample values: 'uid', 'first_name', 'last_name', 'nickname', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'domain', 'has_mobile', 'rate', 'contacts', 'education'.
 * @property nameCase Case for declension of user name and surname: , 'nom' — nominative (default) , 'gen' — genitive , 'dat' — dative , 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
 */
data class FriendsGetWithFields(
    var userId: Int? = null,
    var order: GetOrder? = null,
    var listId: Int? = null,
    var count: Int? = null,
    var offset: Int? = null,
    var fields: List<String>? = null,
    var nameCase: NameCase? = null
) : VkMethod<VkList<UserXtrLists>, UserServiceMethod>("friends.get", jacksonTypeRef())
