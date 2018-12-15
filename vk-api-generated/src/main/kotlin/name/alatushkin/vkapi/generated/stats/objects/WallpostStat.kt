package name.alatushkin.vkapi.generated.stats.objects

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
    val reachSubscribers: Long?
    val reachTotal: Long?
    val links: Long?
    val toGroup: Long?
    val joinGroup: Long?
    val report: Long?
    val hide: Long?
    val unsubscribe: Long?
}
