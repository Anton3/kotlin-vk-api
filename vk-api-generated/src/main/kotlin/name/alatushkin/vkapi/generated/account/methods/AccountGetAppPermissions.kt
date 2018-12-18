@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/account.getAppPermissions]
 *
 * Gets settings of the user in this application.
 *
 * @property userId User ID whose settings information shall be got. By default: current user.
 */
data class AccountGetAppPermissions(
    var userId: Long
) : VkMethod<Long>("account.getAppPermissions", jacksonTypeRef()),
    UserMethod
