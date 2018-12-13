@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.callback.objects.ServerInfo
import name.alatushkin.api.vk.vktypes.VkList

/**
 * [https://vk.com/dev/groups.getCallbackServers]
 *
 * null
 *
 * @property groupId Community ID.
 */
data class GroupsGetCallbackServers(
    var groupId: Long
) : VkMethod<VkList<ServerInfo>>(
    "groups.getCallbackServers",
    jacksonTypeRef()
)
