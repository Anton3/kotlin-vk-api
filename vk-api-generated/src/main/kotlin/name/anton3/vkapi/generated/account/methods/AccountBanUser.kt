@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/account.banUser]
 *
 * Adds user to the banlist.
 *
 * @property userId User ID.
 */
data class AccountBanUser(
    var userId: Int
) : VkMethod<OkResponse>("account.banUser", jacksonTypeRef()),
    UserMethod
