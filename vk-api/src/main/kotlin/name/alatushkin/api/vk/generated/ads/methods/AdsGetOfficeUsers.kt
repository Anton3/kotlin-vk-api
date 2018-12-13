@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.ads.objects.Users
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getOfficeUsers]
 *
 * Returns a list of managers and supervisors of advertising account.
 *
 * @property accountId Advertising account ID.
 */
data class AdsGetOfficeUsers(
    var accountId: Long
) : VkMethod<List<Users>>(
    "ads.getOfficeUsers",
    jacksonTypeRef()
), UserMethod
