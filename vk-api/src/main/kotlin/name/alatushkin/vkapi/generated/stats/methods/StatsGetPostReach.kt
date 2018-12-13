@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.stats.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.stats.objects.WallpostStat
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/stats.getPostReach]
 *
 * Returns stats for a wall post.
 *
 * @property ownerId post owner community id. Specify with "-" sign.
 * @property postId wall post id. Note that stats are available only for '300' last (newest) posts on a community wall.
 */
data class StatsGetPostReach(
    var ownerId: Long,
    var postId: Long
) : VkMethod<List<WallpostStat>>(
    "stats.getPostReach",
    jacksonTypeRef()
), UserMethod
