@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.tokens.UserMethod

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
