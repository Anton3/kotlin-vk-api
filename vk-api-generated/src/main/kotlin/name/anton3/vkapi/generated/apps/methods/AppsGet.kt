@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.apps.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.generated.apps.objects.App
import name.anton3.vkapi.generated.apps.objects.GetPlatform
import name.anton3.vkapi.generated.common.objects.NameCase
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/apps.get]
 *
 * Returns applications data.
 *
 * @property appId Application ID
 * @property appIds List of application ID
 * @property platform platform. Possible values: *'ios' — iOS,, *'android' — Android,, *'winphone' — Windows Phone,, *'web' — приложения на vk.com. By default: 'web'.
 * @property fields Profile fields to return. Sample values: 'nickname', 'screen_name', 'sex', 'bdate' (birthdate), 'city', 'country', 'timezone', 'photo', 'photo_medium', 'photo_big', 'has_mobile', 'contacts', 'education', 'online', 'counters', 'relation', 'last_seen', 'activity', 'can_write_private_message', 'can_see_all_posts', 'can_post', 'universities', (only if return_friends - 1)
 * @property nameCase Case for declension of user name and surname: 'nom' — nominative (default),, 'gen' — genitive,, 'dat' — dative,, 'acc' — accusative,, 'ins' — instrumental,, 'abl' — prepositional. (only if 'return_friends' = '1')
 */
data class AppsGet(
    var appId: Int? = null,
    var appIds: List<String>? = null,
    var platform: GetPlatform? = null,
    var fields: List<String>? = null,
    var nameCase: NameCase? = null
) : VkMethod<VkList<App>>("apps.get", jacksonTypeRef()),
    UserServiceMethod
