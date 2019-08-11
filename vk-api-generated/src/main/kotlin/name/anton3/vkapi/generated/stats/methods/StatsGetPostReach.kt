@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stats.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.stats.objects.WallpostStat
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/stats.getPostReach]
 *
 * Returns stats for a wall post.
 *
 * @property ownerId post owner community id. Specify with "-" sign.
 * @property postId wall post id. Note that stats are available only for '300' last (newest) posts on a community wall.
 */
data class StatsGetPostReach(
    var ownerId: Int,
    var postId: Int
) : CheckedMethod<List<WallpostStat>, UserMethod>("stats.getPostReach", jacksonTypeRef())
