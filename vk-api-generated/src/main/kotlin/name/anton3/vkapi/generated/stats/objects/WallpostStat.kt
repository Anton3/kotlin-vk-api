@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stats.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize

/**
 * No description
 *
 * @property reachSubscribers Subscribers reach
 * @property reachTotal Total reach
 * @property links Link clickthrough
 * @property toGroup Clickthrough to community
 * @property joinGroup People have joined the group
 * @property report Reports number
 * @property hide Hidings number
 * @property unsubscribe Unsubscribed members
 */
@JsonDeserialize(`as` = WallpostStatImpl::class)
interface WallpostStat {
    val reachSubscribers: Int?
    val reachTotal: Int?
    val links: Int?
    val toGroup: Int?
    val joinGroup: Int?
    val report: Int?
    val hide: Int?
    val unsubscribe: Int?
}
