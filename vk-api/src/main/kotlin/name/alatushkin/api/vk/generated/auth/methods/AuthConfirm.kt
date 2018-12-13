@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.auth.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.auth.objects.ConfirmResponse
import name.alatushkin.api.vk.tokens.ServiceMethod

/**
 * [https://vk.com/dev/auth.confirm]
 *
 * Completes a user's registration (begun with the [vk.com/dev/auth.signup|auth.signup] method) using an authorization code.
 *
 * @property clientId 
 * @property clientSecret 
 * @property phone 
 * @property code 
 * @property password 
 * @property testMode 
 * @property intro 
 */
data class AuthConfirm(
    var clientId: Long,
    var phone: String,
    var code: String,
    var password: String? = null,
    var intro: Long? = null
) : VkMethod<ConfirmResponse>(
    "auth.confirm",
    jacksonTypeRef()
), ServiceMethod
