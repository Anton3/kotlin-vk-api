@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.friends.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.friends.objects.UserXtrPhone
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/friends.getByPhones]
 *
 * Returns a list of the current user's friends whose phone numbers, validated or specified in a profile, are in a given list.
 *
 * @property phones List of phone numbers in MSISDN format (maximum 1000). Example: "+79219876543,+79111234567"
 * @property fields Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'rate', 'contacts', 'education', 'online, counters'.
 */
data class FriendsGetByPhones(
    var phones: List<String>? = null,
    var fields: List<String>? = null
) : VkMethod<List<UserXtrPhone>>(
    "friends.getByPhones",
    jacksonTypeRef()
), UserMethod
