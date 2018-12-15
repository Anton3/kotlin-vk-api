@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/groups.leave]
 *
 * With this method you can leave a group, public page, or event.
 *
 * @property groupId ID or screen name of the community.
 */
data class GroupsLeave(
    var groupId: Long
) : VkMethod<OkResponse>("groups.leave", jacksonTypeRef()),
    UserMethod
