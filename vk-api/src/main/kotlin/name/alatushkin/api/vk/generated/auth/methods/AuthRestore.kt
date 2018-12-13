@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.auth.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.auth.objects.RestoreResponse
import name.alatushkin.api.vk.tokens.ServiceMethod

/**
 * [https://vk.com/dev/auth.restore]
 *
 * Allows to restore account access using a code received via SMS. " This method is only available for apps with [vk.com/dev/auth_direct|Direct authorization] access. "
 *
 * @property phone User phone number.
 * @property lastName User last name.
 */
data class AuthRestore(
    var phone: String,
    var lastName: String
) : VkMethod<RestoreResponse>(
    "auth.restore",
    jacksonTypeRef()
), ServiceMethod
