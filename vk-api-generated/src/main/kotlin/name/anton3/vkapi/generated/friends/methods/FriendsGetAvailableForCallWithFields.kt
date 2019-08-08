@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.generated.common.objects.NameCase
import name.anton3.vkapi.generated.users.objects.UserFull
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/friends.getAvailableForCall]
 *
 * Returns a list of friends who can be called by the current user.
 *
 * @property fields Profile fields to return. Sample values: 'uid', 'first_name', 'last_name', 'nickname', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'domain', 'has_mobile', 'rate', 'contacts', 'education'.
 * @property nameCase Case for declension of user name and surname: , 'nom' — nominative (default) , 'gen' — genitive , 'dat' — dative , 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
 */
data class FriendsGetAvailableForCallWithFields(
    var fields: List<String>? = null,
    var nameCase: NameCase? = null
) : VkMethod<VkList<UserFull>>("friends.getAvailableForCall", jacksonTypeRef()),
    UserMethod
