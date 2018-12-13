@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.ads.objects.FloodStats
import name.alatushkin.api.vk.tokens.UserMethod

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
