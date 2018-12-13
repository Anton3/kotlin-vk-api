@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.apps.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.apps.objects.Type
import name.alatushkin.api.vk.generated.users.objects.UserFull
import name.alatushkin.api.vk.tokens.UserMethod
import name.alatushkin.api.vk.vktypes.VkList

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
) : VkMethod<VkList<UserFull>>(
    "apps.getFriendsList",
    jacksonTypeRef()
), UserMethod
