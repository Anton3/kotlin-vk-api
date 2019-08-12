@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.status.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.status.objects.Status
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/status.get]
 *
 * Returns data required to show the status of a user or community.
 *
 * @property userId User ID or community ID. Use a negative value to designate a community ID.
 * @property groupId No description
 */
data class StatusGet(
    var userId: Int? = null,
    var groupId: Int? = null
) : VkMethod<Status, UserMethod>("status.get", jacksonTypeRef())
