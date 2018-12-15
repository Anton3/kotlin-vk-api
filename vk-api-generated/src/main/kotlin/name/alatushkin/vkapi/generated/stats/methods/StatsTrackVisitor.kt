@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.stats.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserMethod
import name.alatushkin.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/stats.trackVisitor]
 *
 * No description
 *

 */
class StatsTrackVisitor : VkMethod<OkResponse>("stats.trackVisitor", jacksonTypeRef()),
    UserMethod
