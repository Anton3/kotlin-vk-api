@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.status.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/status.set]
 *
 * Sets a new status for the current user.
 *
 * @property text Text of the new status.
 * @property groupId Identifier of a community to set a status in. If left blank the status is set to current user.
 */
data class StatusSet(
    var text: String? = null,
    var groupId: Long? = null
) : VkMethod<OkResponse>(
    "status.set",
    jacksonTypeRef()
), UserMethod
