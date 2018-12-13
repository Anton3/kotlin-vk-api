package name.alatushkin.api.vk.generated.ads.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt

data class AdLayout(
    val id: Long,
    val campaignId: Long,
    val adFormat: Long,
    val costType: AdLayoutCostType,
    val video: BoolInt? = null,
    val title: String,
    val description: String,
    val linkUrl: String,
    val linkDomain: String? = null,
    val previewLink: String? = null,
    val imageSrc: Long,
    val imageSrc2x: Long? = null
)
