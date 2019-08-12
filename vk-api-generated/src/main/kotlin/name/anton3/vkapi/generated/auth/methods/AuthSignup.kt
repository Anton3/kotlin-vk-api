@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.auth.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.auth.objects.SignupResponse
import name.anton3.vkapi.generated.common.objects.OwnSex
import name.anton3.vkapi.method.ServiceMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/auth.signup]
 *
 * Registers a new user by phone number.
 *
 * @property firstName User's first name.
 * @property lastName User's surname.
 * @property birthday User's birthday.
 * @property clientId Your application ID.
 * @property clientSecret No description
 * @property phone User's phone number. Can be pre-checked with the [vk.com/dev/auth.checkPhone|auth.checkPhone] method.
 * @property password User's password (minimum of 6 characters). Can be specified later with the [vk.com/dev/auth.confirm|auth.confirm] method.
 * @property testMode '1' — test mode, in which the user will not be registered and the phone number will not be checked for availability, '0' — default mode (default)
 * @property voice '1' — call the phone number and leave a voice message of the authorization code, '0' — send the code by SMS (default)
 * @property sex '1' — female, '2' — male
 * @property sid Session ID required for method recall when SMS was not delivered.
 */
data class AuthSignup(
    var firstName: String,
    var lastName: String,
    var birthday: String,
    var clientId: Int,
    var phone: String,
    var password: String? = null,
    var voice: Boolean? = null,
    var sex: OwnSex? = null,
    var sid: String? = null
) : VkMethod<SignupResponse, ServiceMethod>("auth.signup", jacksonTypeRef())
