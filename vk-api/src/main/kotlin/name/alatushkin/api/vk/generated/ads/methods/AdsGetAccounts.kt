@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.ads.objects.Account
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getAccounts]
 *
 * Returns a list of advertising accounts.
 *

 */
class AdsGetAccounts : VkMethod<List<Account>>(
    "ads.getAccounts",
    jacksonTypeRef()
), UserMethod
