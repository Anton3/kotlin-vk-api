@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.secure.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.secure.objects.TokenChecked
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

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
) : CheckedMethod<TokenChecked, UserMethod>("secure.checkToken", jacksonTypeRef())
