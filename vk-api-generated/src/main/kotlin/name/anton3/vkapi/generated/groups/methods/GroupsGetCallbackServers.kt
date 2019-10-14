@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.groups.objects.CallbackServer
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/groups.getCallbackServers]
 *
 * No description
 *
 * @property groupId No description
 * @property serverIds No description
 */
data class GroupsGetCallbackServers(
    var groupId: Int,
    var serverIds: List<Int>? = null
) : VkMethod<VkList<CallbackServer>, UserGroupMethod>("groups.getCallbackServers", jacksonTypeRef())
