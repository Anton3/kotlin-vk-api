@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.ads.objects.Account
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/ads.getAccounts]
 *
 * Returns a list of advertising accounts.
 *

 */
class AdsGetAccounts : VkMethod<List<Account>, UserMethod>("ads.getAccounts", jacksonTypeRef())
