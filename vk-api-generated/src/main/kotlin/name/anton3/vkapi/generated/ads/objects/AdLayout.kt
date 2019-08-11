package name.anton3.vkapi.generated.ads.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property id Ad ID
 * @property campaignId Campaign ID
 * @property adFormat Ad format
 * @property costType No description
 * @property video Information whether the ad is a video
 * @property title Ad title
 * @property description Ad description
 * @property linkUrl URL of advertised object
 * @property linkDomain Domain of advertised object
 * @property previewLink link to preview an ad as it is shown on the website
 * @property imageSrc Image URL
 * @property imageSrc2x URL of the preview image in double size
 */
data class AdLayout(
    val id: Int,
    val campaignId: Int,
    val adFormat: Int,
    val costType: AdLayoutCostType,
    val video: BoolInt? = null,
    val title: String,
    val description: String,
    val linkUrl: String,
    val linkDomain: String? = null,
    val previewLink: String? = null,
    val imageSrc: Int,
    val imageSrc2x: Int? = null
)
