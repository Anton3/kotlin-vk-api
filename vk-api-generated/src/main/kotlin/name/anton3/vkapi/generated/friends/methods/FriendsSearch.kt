@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.common.objects.NameCase
import name.anton3.vkapi.generated.users.objects.Fields
import name.anton3.vkapi.generated.users.objects.UserFull
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/friends.search]
 *
 * Returns a list of friends matching the search criteria.
 *
 * @property userId User ID.
 * @property q Search query string (e.g., 'Vasya Babich').
 * @property fields Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'rate', 'contacts', 'education', 'online',
 * @property nameCase Case for declension of user name and surname: 'nom' — nominative (default), 'gen' — genitive , 'dat' — dative, 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
 * @property offset Offset needed to return a specific subset of friends.
 * @property count Number of friends to return.
 */
data class FriendsSearch(
    var userId: Int,
    var q: String? = null,
    var fields: List<Fields>? = null,
    var nameCase: NameCase? = null,
    var offset: Int? = null,
    var count: Int? = null
) : VkMethod<VkList<UserFull>, UserMethod>("friends.search", jacksonTypeRef())
