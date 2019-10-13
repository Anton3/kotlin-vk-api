@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * No description
 *
 * @property hide Hides amount
 * @property id Object ID from 'ids' parameter
 * @property joinGroup Community joins
 * @property links Link clicks
 * @property reachSubscribers Subscribers reach
 * @property reachTotal Total reach
 * @property report Reports amount
 * @property toGroup Community clicks
 * @property unsubscribe 'Unsubscribe' events amount
 * @property videoViews100p Video views for 100 percent
 * @property videoViews25p Video views for 25 percent
 * @property videoViews3s Video views for 3 seconds
 * @property videoViews50p Video views for 50 percent
 * @property videoViews75p Video views for 75 percent
 * @property videoViewsStart Video starts
 */
data class PromotedPostReach(
    val hide: Int,
    val id: Int,
    val joinGroup: Int,
    val links: Int,
    val reachSubscribers: Int,
    val reachTotal: Int,
    val report: Int,
    val toGroup: Int,
    val unsubscribe: Int,
    @get:JsonProperty("video_views_100p") val videoViews100p: Int? = null,
    @get:JsonProperty("video_views_25p") val videoViews25p: Int? = null,
    @get:JsonProperty("video_views_3s") val videoViews3s: Int? = null,
    @get:JsonProperty("video_views_50p") val videoViews50p: Int? = null,
    @get:JsonProperty("video_views_75p") val videoViews75p: Int? = null,
    val videoViewsStart: Int? = null
)
