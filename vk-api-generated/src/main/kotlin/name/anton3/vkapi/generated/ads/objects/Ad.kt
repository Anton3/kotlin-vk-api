@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property adFormat Ad format
 * @property adPlatform Ad platform
 * @property allLimit Total limit
 * @property approved No description
 * @property campaignId Campaign ID
 * @property category1Id Category ID
 * @property category2Id Additional category ID
 * @property costType No description
 * @property cpc Cost of a click, kopecks
 * @property cpm Cost of 1000 impressions, kopecks
 * @property cpa Cost of an action, kopecks
 * @property disclaimerMedical No description
 * @property disclaimerSpecialist No description
 * @property disclaimerSupplements No description
 * @property id Ad ID
 * @property impressionsLimit Impressions limit
 * @property impressionsLimited No description
 * @property name Ad title
 * @property status No description
 * @property video No description
 */
data class Ad(
    val adFormat: Int,
    val adPlatform: String? = null,
    val allLimit: Int,
    val approved: AdApproved,
    val campaignId: Int,
    val category1Id: Int? = null,
    val category2Id: Int? = null,
    val costType: AdCostType,
    val cpc: Int? = null,
    val cpm: Int? = null,
    val cpa: Int? = null,
    val disclaimerMedical: BoolInt? = null,
    val disclaimerSpecialist: BoolInt? = null,
    val disclaimerSupplements: BoolInt? = null,
    val id: Int,
    val impressionsLimit: Int? = null,
    val impressionsLimited: BoolInt? = null,
    val name: String,
    val status: AdStatus,
    val video: BoolInt? = null
)
