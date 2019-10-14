@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/groups.enableOnline]
 *
 * No description
 *
 * @property groupId No description
 */
data class GroupsEnableOnline(
    var groupId: Int
) : VkMethod<OkResponse, UserGroupMethod>("groups.enableOnline", jacksonTypeRef())
