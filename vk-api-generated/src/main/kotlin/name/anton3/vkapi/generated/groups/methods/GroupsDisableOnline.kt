@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/groups.disableOnline]
 *
 * Disables 'online' status in a community
 *
 * @property groupId Group ID
 */
data class GroupsDisableOnline(
    var groupId: Int
) : CheckedMethod<OkResponse, UserGroupMethod>("groups.disableOnline", jacksonTypeRef())
