@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserGroupMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/groups.enableOnline]
 *
 * Enables 'online' status in a community
 *
 * @property groupId Group ID
 */
data class GroupsEnableOnline(
    var groupId: Int
) : VkMethod<OkResponse>("groups.enableOnline", jacksonTypeRef()),
    UserGroupMethod
