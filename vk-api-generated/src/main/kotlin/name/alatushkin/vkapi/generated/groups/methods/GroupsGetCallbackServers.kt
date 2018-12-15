@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.callback.objects.ServerInfo
import name.alatushkin.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/groups.getCallbackServers]
 *
 * No description
 *
 * @property groupId Community ID.
 */
data class GroupsGetCallbackServers(
    var groupId: Long
) : VkMethod<VkList<ServerInfo>>("groups.getCallbackServers", jacksonTypeRef())
