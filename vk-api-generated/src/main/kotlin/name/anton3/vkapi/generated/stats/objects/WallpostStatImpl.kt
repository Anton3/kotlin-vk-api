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
@JsonDeserialize(`as` = Void::class)
data class WallpostStatImpl(
    override val reachSubscribers: Int? = null,
    override val reachTotal: Int? = null,
    override val links: Int? = null,
    override val toGroup: Int? = null,
    override val joinGroup: Int? = null,
    override val report: Int? = null,
    override val hide: Int? = null,
    override val unsubscribe: Int? = null
) : WallpostStat
