@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/groups.deleteLink]
 *
 * Allows to delete a link from the community.
 *
 * @property groupId Community ID.
 * @property linkId Link ID.
 */
data class GroupsDeleteLink(
    var groupId: Int,
    var linkId: Int
) : VkMethod<OkResponse, UserMethod>("groups.deleteLink", jacksonTypeRef())
