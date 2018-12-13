@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.auth.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.tokens.ServiceMethod

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
