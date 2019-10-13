@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stats.objects

/**
 * No description
 *
 * @property hide Hidings number
 * @property joinGroup People have joined the group
 * @property links Link clickthrough
 * @property reachSubscribers Subscribers reach
 * @property reachTotal Total reach
 * @property report Reports number
 * @property toGroup Clickthrough to community
 * @property unsubscribe Unsubscribed members
 */
data class WallpostStat(
    val hide: Int? = null,
    val joinGroup: Int? = null,
    val links: Int? = null,
    val reachSubscribers: Int? = null,
    val reachTotal: Int? = null,
    val report: Int? = null,
    val toGroup: Int? = null,
    val unsubscribe: Int? = null
)
