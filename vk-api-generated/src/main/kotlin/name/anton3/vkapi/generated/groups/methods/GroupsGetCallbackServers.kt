@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.callback.objects.ServerInfo
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/groups.getCallbackServers]
 *
 * No description
 *
 * @property groupId Community ID.
 */
data class GroupsGetCallbackServers(
    var groupId: Int
) : VkMethod<VkList<ServerInfo>>("groups.getCallbackServers", jacksonTypeRef())
