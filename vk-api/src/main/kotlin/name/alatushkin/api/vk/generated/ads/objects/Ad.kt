package name.alatushkin.api.vk.generated.ads.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt

data class Ad(
    val id: Long,
    val campaignId: Long,
    val adFormat: Long,
    val costType: AdCostType,
    val cpc: Long? = null,
    val cpm: Long? = null,
    val impressionsLimit: Long? = null,
    val impressionsLimited: BoolInt? = null,
    val adPlatform: String? = null,
    val allLimit: Long,
    val category1Id: Long? = null,
    val category2Id: Long? = null,
    val status: AdStatus,
    val name: String,
    val approved: AdApproved,
    val video: BoolInt? = null,
    val disclaimerMedical: BoolInt? = null,
    val disclaimerSpecialist: BoolInt? = null,
    val disclaimerSupplements: BoolInt? = null
)
