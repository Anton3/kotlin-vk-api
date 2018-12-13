@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.invite]
 *
 * Allows to invite friends to the community.
 *
 * @property groupId Community ID.
 * @property userId User ID.
 */
data class GroupsInvite(
    var groupId: Long,
    var userId: Long
) : VkMethod<OkResponse>(
    "groups.invite",
    jacksonTypeRef()
), UserMethod
