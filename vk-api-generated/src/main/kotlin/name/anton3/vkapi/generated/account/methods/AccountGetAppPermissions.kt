@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/account.getAppPermissions]
 *
 * Gets settings of the user in this application.
 *
 * @property userId User ID whose settings information shall be got. By default: current user.
 */
data class AccountGetAppPermissions(
    var userId: Int
) : CheckedMethod<Int, UserMethod>("account.getAppPermissions", jacksonTypeRef())
