@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

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
    var groupId: Long,
    var linkId: Long,
    var after: Long? = null
) : VkMethod<OkResponse>(
    "groups.reorderLink",
    jacksonTypeRef()
), UserMethod
