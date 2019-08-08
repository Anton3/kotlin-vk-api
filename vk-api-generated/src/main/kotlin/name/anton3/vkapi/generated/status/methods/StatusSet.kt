@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.status.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.method.UserMethod
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
    var groupId: Int? = null
) : VkMethod<OkResponse>("status.set", jacksonTypeRef()),
    UserMethod
