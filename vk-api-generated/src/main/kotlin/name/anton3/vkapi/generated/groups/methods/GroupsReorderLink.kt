@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/groups.reorderLink]
 *
 * Allows to reorder links in the community.
 *
 * @property groupId Community ID.
 * @property linkId Link ID.
 * @property after ID of the link after which to place the link with 'link_id'.
 */
data class GroupsReorderLink(
    var groupId: Int,
    var linkId: Int,
    var after: Int? = null
) : CheckedMethod<OkResponse, UserMethod>("groups.reorderLink", jacksonTypeRef())
