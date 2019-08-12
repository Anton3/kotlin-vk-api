@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.groups.objects.CallbackSettings
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/groups.getCallbackSettings]
 *
 * Returns [vk.com/dev/callback_api|Callback API] notifications settings.
 *
 * @property groupId Community ID.
 * @property serverId Server ID.
 */
data class GroupsGetCallbackSettings(
    var groupId: Int,
    var serverId: Int? = null
) : VkMethod<CallbackSettings, UserGroupMethod>("groups.getCallbackSettings", jacksonTypeRef())
