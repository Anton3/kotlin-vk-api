@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/account.unbanUser]
 *
 * Deletes user from the blacklist.
 *
 * @property userId User ID.
 */
data class AccountUnbanUser(
    var userId: Long
) : VkMethod<OkResponse>("account.unbanUser", jacksonTypeRef()),
    UserMethod
