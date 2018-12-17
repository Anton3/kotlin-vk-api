@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.NameCase
import name.alatushkin.vkapi.generated.users.objects.UserFull
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/friends.getSuggestions]
 *
 * Returns a list of profiles of users whom the current user may know.
 *
 * @property filter Types of potential friends to return: 'mutual' — users with many mutual friends , 'contacts' — users found with the [vk.com/dev/account.importContacts|account.importContacts] method , 'mutual_contacts' — users who imported the same contacts as the current user with the [vk.com/dev/account.importContacts|account.importContacts] method
 * @property count Number of suggestions to return.
 * @property offset Offset needed to return a specific subset of suggestions.
 * @property fields Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'rate', 'contacts', 'education', 'online', 'counters'.
 * @property nameCase Case for declension of user name and surname: , 'nom' — nominative (default) , 'gen' — genitive , 'dat' — dative , 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
 */
data class FriendsGetSuggestions(
    var filter: List<String>? = null,
    var count: Long? = null,
    var offset: Long? = null,
    var fields: List<String>? = null,
    var nameCase: NameCase? = null
) : VkMethod<VkList<UserFull>>("friends.getSuggestions", jacksonTypeRef()),
    UserMethod