@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

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
    var groupId: Long,
    var linkId: Long,
    var text: String? = null
) : VkMethod<OkResponse>("groups.editLink", jacksonTypeRef()),
    UserMethod
