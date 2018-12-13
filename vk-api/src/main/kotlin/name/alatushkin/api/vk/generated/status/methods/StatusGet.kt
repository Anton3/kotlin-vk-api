@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.status.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.status.objects.Status
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/status.get]
 *
 * Returns data required to show the status of a user or community.
 *
 * @property userId User ID or community ID. Use a negative value to designate a community ID.
 * @property groupId 
 */
data class StatusGet(
    var userId: Long? = null,
    var groupId: Long? = null
) : VkMethod<Status>(
    "status.get",
    jacksonTypeRef()
), UserMethod
