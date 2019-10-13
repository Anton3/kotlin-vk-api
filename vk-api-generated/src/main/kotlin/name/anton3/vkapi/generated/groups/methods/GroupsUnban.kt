@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/groups.unban]
 *
 * No description
 *
 * @property groupId No description
 * @property ownerId No description
 */
data class GroupsUnban(
    var groupId: Int,
    var ownerId: Int? = null
) : VkMethod<OkResponse, UserMethod>("groups.unban", jacksonTypeRef())
