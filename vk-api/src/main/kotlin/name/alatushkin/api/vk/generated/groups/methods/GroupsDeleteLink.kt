@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.deleteLink]
 *
 * Allows to delete a link from the community.
 *
 * @property groupId Community ID.
 * @property linkId Link ID.
 */
data class GroupsDeleteLink(
    var groupId: Long,
    var linkId: Long
) : VkMethod<OkResponse>(
    "groups.deleteLink",
    jacksonTypeRef()
), UserMethod
