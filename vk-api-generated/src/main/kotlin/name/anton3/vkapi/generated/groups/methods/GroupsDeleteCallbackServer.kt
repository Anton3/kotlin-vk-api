@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/groups.deleteCallbackServer]
 *
 * No description
 *
 * @property groupId No description
 * @property serverId No description
 */
data class GroupsDeleteCallbackServer(
    var groupId: Int,
    var serverId: Int
) : VkMethod<OkResponse, UserGroupMethod>("groups.deleteCallbackServer", jacksonTypeRef())
