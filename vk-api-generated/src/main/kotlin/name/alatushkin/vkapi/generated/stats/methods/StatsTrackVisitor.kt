@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stats.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/stats.trackVisitor]
 *
 * No description
 *

 */
class StatsTrackVisitor : VkMethod<OkResponse>("stats.trackVisitor", jacksonTypeRef()),
    UserMethod
