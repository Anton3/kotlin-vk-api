@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/groups.editLink]
 *
 * Allows to edit a link in the community.
 *
 * @property groupId Community ID.
 * @property linkId Link ID.
 * @property text New description text for the link.
 */
data class GroupsEditLink(
    var groupId: Int,
    var linkId: Int,
    var text: String? = null
) : VkMethod<OkResponse>("groups.editLink", jacksonTypeRef()),
    UserMethod
