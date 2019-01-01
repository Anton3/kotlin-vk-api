@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getBudget]
 *
 * Returns current budget of the advertising account.
 *
 * @property accountId Advertising account ID.
 */
data class AdsGetBudget(
    var accountId: Int
) : VkMethod<Int>("ads.getBudget", jacksonTypeRef()),
    UserMethod
