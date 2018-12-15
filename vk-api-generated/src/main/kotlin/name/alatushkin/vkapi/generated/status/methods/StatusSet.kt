@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.status.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

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
) : VkMethod<OkResponse>("status.set", jacksonTypeRef()),
    UserMethod
