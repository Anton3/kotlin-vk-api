@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/ads.addOfficeUsers]
 *
 * Adds managers and/or supervisors to advertising account.
 *
 * @property accountId Advertising account ID.
 * @property data Serialized JSON array of objects that describe added managers. Description of 'user_specification' objects see below.
 */
data class AdsAddOfficeUsers(
    var accountId: Int,
    var data: String
) : CheckedMethod<Boolean, UserMethod>("ads.addOfficeUsers", jacksonTypeRef())
