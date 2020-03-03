@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.apps.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.apps.objects.RequestType
import name.anton3.vkapi.generated.users.objects.Fields
import name.anton3.vkapi.generated.users.objects.UserFull
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/apps.getFriendsList]
 *
 * Creates friends list for requests and invites in current app.
 *
 * @property extended No description
 * @property count List size.
 * @property offset No description
 * @property type List type. Possible values: * 'invite' — available for invites (don't play the game),, * 'request' — available for request (play the game). By default: 'invite'.
 * @property fields Additional profile fields, see [vk.com/dev/fields|description].
 */
data class AppsGetFriendsList(
    var extended: Boolean? = null,
    var count: Int? = null,
    var offset: Int? = null,
    var type: RequestType? = null,
    var fields: List<Fields>? = null
) : VkMethod<VkList<UserFull>, UserMethod>("apps.getFriendsList", jacksonTypeRef())
