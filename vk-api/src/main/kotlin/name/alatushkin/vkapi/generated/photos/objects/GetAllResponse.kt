package name.alatushkin.vkapi.generated.photos.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt

data class GetAllResponse(
    val count: Long? = null,
    val items: List<PhotoXtrRealOffset>? = null,
    val more: BoolInt? = null
)
