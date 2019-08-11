@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.auth.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.ServiceMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/auth.checkPhone]
 *
 * Checks a user's phone number for correctness.
 *
 * @property phone Phone number.
 * @property clientId User ID.
 * @property clientSecret No description
 * @property authByPhone No description
 */
data class AuthCheckPhone(
    var phone: String,
    var clientId: Int? = null,
    var authByPhone: Boolean? = null
) : CheckedMethod<OkResponse, ServiceMethod>("auth.checkPhone", jacksonTypeRef())
