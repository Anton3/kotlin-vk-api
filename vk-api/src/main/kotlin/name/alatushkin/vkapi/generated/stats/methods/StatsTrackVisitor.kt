@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.stats.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/stats.trackVisitor]
 *
 * null
 *

 */
class StatsTrackVisitor : VkMethod<OkResponse>(
    "stats.trackVisitor",
    jacksonTypeRef()
), UserMethod
