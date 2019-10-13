@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/groups.editCallbackServer]
 *
 * No description
 *
 * @property groupId No description
 * @property serverId No description
 * @property url No description
 * @property title No description
 * @property secretKey No description
 */
data class GroupsEditCallbackServer(
    var groupId: Int,
    var serverId: Int,
    var url: String,
    var title: String,
    var secretKey: String? = null
) : VkMethod<OkResponse, UserGroupMethod>("groups.editCallbackServer", jacksonTypeRef())
