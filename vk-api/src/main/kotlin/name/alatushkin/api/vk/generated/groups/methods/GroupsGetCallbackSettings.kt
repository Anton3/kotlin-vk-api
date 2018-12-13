@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.groups.objects.CallbackSettings
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/groups.getCallbackSettings]
 *
 * Returns [vk.com/dev/callback_api|Callback API] notifications settings.
 *
 * @property groupId Community ID.
 * @property serverId Server ID.
 */
data class GroupsGetCallbackSettings(
    var groupId: Long,
    var serverId: Long? = null
) : VkMethod<CallbackSettings>(
    "groups.getCallbackSettings",
    jacksonTypeRef()
), UserGroupMethod
