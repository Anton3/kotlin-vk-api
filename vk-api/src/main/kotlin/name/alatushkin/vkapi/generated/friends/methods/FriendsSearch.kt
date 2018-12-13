@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.NameCase
import name.alatushkin.vkapi.generated.users.objects.UserFull
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.VkList

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
    var userId: Long,
    var q: String? = null,
    var fields: List<String>? = null,
    var nameCase: NameCase? = null,
    var offset: Long? = null,
    var count: Long? = null
) : VkMethod<VkList<UserFull>>(
    "friends.search",
    jacksonTypeRef()
), UserMethod
