@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.users.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.NameCase
import name.alatushkin.vkapi.generated.users.objects.UserXtrCounters
import name.alatushkin.vkapi.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/users.get]
 *
 * Returns detailed information on users.
 *
 * @property userIds User IDs or screen names ('screen_name'). By default, current user ID.
 * @property fields Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'contacts', 'education', 'online', 'counters', 'relation', 'last_seen', 'activity', 'can_write_private_message', 'can_see_all_posts', 'can_post', 'universities',
 * @property nameCase Case for declension of user name and surname: 'nom' — nominative (default), 'gen' — genitive , 'dat' — dative, 'acc' — accusative , 'ins' — instrumental , 'abl' — prepositional
 */
data class UsersGet(
    var userIds: List<String>? = null,
    var fields: List<String>? = null,
    var nameCase: NameCase? = null
) : VkMethod<List<UserXtrCounters>>(
    "users.get",
    jacksonTypeRef()
), UserServiceMethod
