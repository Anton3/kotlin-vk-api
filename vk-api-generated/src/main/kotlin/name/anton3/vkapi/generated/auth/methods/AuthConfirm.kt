@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.auth.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.auth.objects.ConfirmResponse
import name.anton3.vkapi.method.ServiceMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/auth.confirm]
 *
 * Completes a user's registration (begun with the [vk.com/dev/auth.signup|auth.signup] method) using an authorization code.
 *
 * @property clientId No description
 * @property clientSecret No description
 * @property phone No description
 * @property code No description
 * @property password No description
 * @property testMode No description
 * @property intro No description
 */
data class AuthConfirm(
    var clientId: Int,
    var phone: String,
    var code: String,
    var password: String? = null,
    var intro: Int? = null
) : VkMethod<ConfirmResponse, ServiceMethod>("auth.confirm", jacksonTypeRef())
