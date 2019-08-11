package name.anton3.vkapi.generated.ads.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property id Ad ID
 * @property campaignId Campaign ID
 * @property adFormat Ad format
 * @property costType No description
 * @property cpc Cost of a click, kopecks
 * @property cpm Cost of 1000 impressions, kopecks
 * @property impressionsLimit Impressions limit
 * @property impressionsLimited Information whether impressions are limited
 * @property adPlatform Ad platform
 * @property allLimit Total limit
 * @property category1Id Category ID
 * @property category2Id Additional category ID
 * @property status No description
 * @property name Ad title
 * @property approved No description
 * @property video Information whether the ad is a video
 * @property disclaimerMedical Information whether disclaimer is enabled
 * @property disclaimerSpecialist Information whether disclaimer is enabled
 * @property disclaimerSupplements Information whether disclaimer is enabled
 */
data class Ad(
    val id: Int,
    val campaignId: Int,
    val adFormat: Int,
    val costType: AdCostType,
    val cpc: Int? = null,
    val cpm: Int? = null,
    val impressionsLimit: Int? = null,
    val impressionsLimited: BoolInt? = null,
    val adPlatform: String? = null,
    val allLimit: Int,
    val category1Id: Int? = null,
    val category2Id: Int? = null,
    val status: AdStatus,
    val name: String,
    val approved: AdApproved,
    val video: BoolInt? = null,
    val disclaimerMedical: BoolInt? = null,
    val disclaimerSpecialist: BoolInt? = null,
    val disclaimerSupplements: BoolInt? = null
)
