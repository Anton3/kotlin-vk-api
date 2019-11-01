@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonProperty
import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property adFormat Ad format
 * @property campaignId Campaign ID
 * @property costType No description
 * @property description Ad description
 * @property id Ad ID
 * @property imageSrc Image URL
 * @property imageSrc2x URL of the preview image in double size
 * @property linkDomain Domain of advertised object
 * @property linkUrl URL of advertised object
 * @property previewLink link to preview an ad as it is shown on the website
 * @property title Ad title
 * @property video Information whether the ad is a video
 */
data class AdLayout(
    val adFormat: Int,
    val campaignId: Int,
    val costType: AdCostType,
    val description: String,
    val id: Int,
    val imageSrc: String,
    @get:JsonProperty("image_src_2x") val imageSrc2x: String? = null,
    val linkDomain: String? = null,
    val linkUrl: String,
    val previewLink: String? = null,
    val title: String,
    val video: BoolInt? = null
)
