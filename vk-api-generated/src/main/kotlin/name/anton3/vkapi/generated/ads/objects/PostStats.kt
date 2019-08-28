@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.stats.objects.WallpostStat

/**
 * No description
 *
 * @property adId Object ID
 * @property reachSubscribers Subscribers reach
 * @property reachTotal Total reach
 * @property links Link clickthrough
 * @property toGroup Clickthrough to community
 * @property joinGroup People have joined the group
 * @property report Reports number
 * @property hide Hidings number
 * @property unsubscribe Unsubscribed members
 */
@JsonDeserialize(`as` = Void::class)
data class PostStats(
    val adId: Int? = null,
    override val reachSubscribers: Int? = null,
    override val reachTotal: Int? = null,
    override val links: Int? = null,
    override val toGroup: Int? = null,
    override val joinGroup: Int? = null,
    override val report: Int? = null,
    override val hide: Int? = null,
    override val unsubscribe: Int? = null
) : WallpostStat
