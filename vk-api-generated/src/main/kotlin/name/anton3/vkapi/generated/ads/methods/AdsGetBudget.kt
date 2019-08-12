@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/ads.getBudget]
 *
 * Returns current budget of the advertising account.
 *
 * @property accountId Advertising account ID.
 */
data class AdsGetBudget(
    var accountId: Int
) : VkMethod<Int, UserMethod>("ads.getBudget", jacksonTypeRef())
