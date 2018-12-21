@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.status.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

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
