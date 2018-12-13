@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getBudget]
 *
 * Returns current budget of the advertising account.
 *
 * @property accountId Advertising account ID.
 */
data class AdsGetBudget(
    var accountId: Long
) : VkMethod<Long>(
    "ads.getBudget",
    jacksonTypeRef()
), UserMethod
