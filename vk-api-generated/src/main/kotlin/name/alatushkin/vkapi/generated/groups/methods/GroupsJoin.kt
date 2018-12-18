@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/groups.join]
 *
 * With this method you can join the group or public page, and also confirm your participation in an event.
 *
 * @property groupId ID or screen name of the community.
 * @property notSure Optional parameter which is taken into account when 'gid' belongs to the event: '1' — Perhaps I will attend, '0' — I will be there for sure (default), ,
 */
data class GroupsJoin(
    var groupId: Long? = null,
    var notSure: String? = null
) : VkMethod<OkResponse>("groups.join", jacksonTypeRef()),
    UserMethod
