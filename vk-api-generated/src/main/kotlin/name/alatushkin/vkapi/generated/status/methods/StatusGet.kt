@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.status.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.status.objects.Status
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/status.get]
 *
 * Returns data required to show the status of a user or community.
 *
 * @property userId User ID or community ID. Use a negative value to designate a community ID.
 * @property groupId No description
 */
data class StatusGet(
    var userId: Long? = null,
    var groupId: Long? = null
) : VkMethod<Status>("status.get", jacksonTypeRef()),
    UserMethod
