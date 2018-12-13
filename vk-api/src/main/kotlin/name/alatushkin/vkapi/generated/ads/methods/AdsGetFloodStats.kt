@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.ads.objects.FloodStats
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getFloodStats]
 *
 * Returns information about current state of a counter — number of remaining runs of methods and time to the next counter nulling in seconds.
 *
 * @property accountId Advertising account ID.
 */
data class AdsGetFloodStats(
    var accountId: Long
) : VkMethod<FloodStats>(
    "ads.getFloodStats",
    jacksonTypeRef()
), UserMethod
