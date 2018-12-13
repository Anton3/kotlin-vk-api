package name.alatushkin.api.vk.generated.photos.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt

data class GetAllResponse(
    val count: Long? = null,
    val items: List<PhotoXtrRealOffset>? = null,
    val more: BoolInt? = null
)
