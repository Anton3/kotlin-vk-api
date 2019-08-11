@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.ads.objects.Users
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/ads.getOfficeUsers]
 *
 * Returns a list of managers and supervisors of advertising account.
 *
 * @property accountId Advertising account ID.
 */
data class AdsGetOfficeUsers(
    var accountId: Int
) : CheckedMethod<List<Users>, UserMethod>("ads.getOfficeUsers", jacksonTypeRef())
