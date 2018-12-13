@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.addOfficeUsers]
 *
 * Adds managers and/or supervisors to advertising account.
 *
 * @property accountId Advertising account ID.
 * @property data Serialized JSON array of objects that describe added managers. Description of 'user_specification' objects see below.
 */
data class AdsAddOfficeUsers(
    var accountId: Long,
    var data: String
) : VkMethod<Boolean>(
    "ads.addOfficeUsers",
    jacksonTypeRef()
), UserMethod
