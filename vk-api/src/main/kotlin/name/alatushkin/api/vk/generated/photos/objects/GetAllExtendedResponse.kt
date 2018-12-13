package name.alatushkin.api.vk.generated.photos.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt

data class GetAllExtendedResponse(
    val count: Long? = null,
    val items: List<PhotoFullXtrRealOffset>? = null,
    val more: BoolInt? = null
)
