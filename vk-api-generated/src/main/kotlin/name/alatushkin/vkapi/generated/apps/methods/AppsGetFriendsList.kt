@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.apps.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.apps.objects.Type
import name.alatushkin.vkapi.generated.users.objects.UserFull
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/apps.getFriendsList]
 *
 * Creates friends list for requests and invites in current app.
 *
 * @property count List size.
 * @property type List type. Possible values: * 'invite' — available for invites (don't play the game),, * 'request' — available for request (play the game). By default: 'invite'.
 * @property fields Additional profile fields, see [vk.com/dev/fields|description].
 */
data class AppsGetFriendsList(
    var count: Long? = null,
    var type: Type? = null,
    var fields: List<String>? = null
) : VkMethod<VkList<UserFull>>("apps.getFriendsList", jacksonTypeRef()),
    UserMethod
