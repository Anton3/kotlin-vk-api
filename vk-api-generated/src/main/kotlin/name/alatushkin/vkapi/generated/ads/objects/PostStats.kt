package name.alatushkin.vkapi.generated.ads.objects

import name.alatushkin.vkapi.generated.stats.objects.WallpostStat

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
data class PostStats(
    val adId: Long? = null,
    override val reachSubscribers: Long? = null,
    override val reachTotal: Long? = null,
    override val links: Long? = null,
    override val toGroup: Long? = null,
    override val joinGroup: Long? = null,
    override val report: Long? = null,
    override val hide: Long? = null,
    override val unsubscribe: Long? = null
) : WallpostStat
