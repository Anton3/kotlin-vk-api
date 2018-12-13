@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.auth.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.tokens.ServiceMethod

/**
 * [https://vk.com/dev/auth.checkPhone]
 *
 * Checks a user's phone number for correctness.
 *
 * @property phone Phone number.
 * @property clientId User ID.
 * @property clientSecret 
 * @property authByPhone 
 */
data class AuthCheckPhone(
    var phone: String,
    var clientId: Long? = null,
    var authByPhone: Boolean? = null
) : VkMethod<OkResponse>(
    "auth.checkPhone",
    jacksonTypeRef()
), ServiceMethod
