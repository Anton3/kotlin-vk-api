@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.account.objects.ChangePasswordResponse
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/account.changePassword]
 *
 * Changes a user password after access is successfully restored with the [vk.com/dev/auth.restore|auth.restore] method.
 *
 * @property restoreSid Session id received after the [vk.com/dev/auth.restore|auth.restore] method is executed. (If the password is changed right after the access was restored)
 * @property changePasswordHash Hash received after a successful OAuth authorization with a code got by SMS. (If the password is changed right after the access was restored)
 * @property oldPassword Current user password.
 * @property newPassword New password that will be set as a current
 */
data class AccountChangePassword(
    var restoreSid: String? = null,
    var changePasswordHash: String? = null,
    var oldPassword: String? = null,
    var newPassword: String
) : CheckedMethod<ChangePasswordResponse, UserMethod>("account.changePassword", jacksonTypeRef())
