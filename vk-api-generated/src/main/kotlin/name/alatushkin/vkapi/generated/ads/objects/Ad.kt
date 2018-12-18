package name.anton3.vkapi.generated.ads.objects

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
    val id: Long,
    val campaignId: Long,
    val adFormat: Long,
    val costType: AdCostType,
    val cpc: Long? = null,
    val cpm: Long? = null,
    val impressionsLimit: Long? = null,
    val impressionsLimited: Boolean? = null,
    val adPlatform: String? = null,
    val allLimit: Long,
    val category1Id: Long? = null,
    val category2Id: Long? = null,
    val status: AdStatus,
    val name: String,
    val approved: AdApproved,
    val video: Boolean? = null,
    val disclaimerMedical: Boolean? = null,
    val disclaimerSpecialist: Boolean? = null,
    val disclaimerSupplements: Boolean? = null
)
