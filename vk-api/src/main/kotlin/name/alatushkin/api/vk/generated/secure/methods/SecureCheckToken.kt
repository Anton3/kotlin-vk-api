@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.secure.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.secure.objects.TokenChecked
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/secure.checkToken]
 *
 * Checks the user authentication in 'IFrame' and 'Flash' apps using the 'access_token' parameter.
 *
 * @property token client 'access_token'
 * @property ip user 'ip address'. Note that user may access using the 'ipv6' address, in this case it is required to transmit the 'ipv6' address. If not transmitted, the address will not be checked.
 */
data class SecureCheckToken(
    var token: String? = null,
    var ip: String? = null
) : VkMethod<TokenChecked>(
    "secure.checkToken",
    jacksonTypeRef()
), UserMethod
