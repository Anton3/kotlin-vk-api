@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

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
) : VkMethod<OkResponse>(
    "groups.editLink",
    jacksonTypeRef()
), UserMethod
