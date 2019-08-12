@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/groups.leave]
 *
 * With this method you can leave a group, public page, or event.
 *
 * @property groupId ID or screen name of the community.
 */
data class GroupsLeave(
    var groupId: Int
) : VkMethod<OkResponse, UserMethod>("groups.leave", jacksonTypeRef())
