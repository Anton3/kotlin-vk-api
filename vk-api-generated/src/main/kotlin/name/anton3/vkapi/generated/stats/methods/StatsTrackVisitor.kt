@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stats.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/stats.trackVisitor]
 *
 * No description
 *
 * @property id No description
 */
data class StatsTrackVisitor(
    var id: String
) : VkMethod<OkResponse, UserMethod>("stats.trackVisitor", jacksonTypeRef())
