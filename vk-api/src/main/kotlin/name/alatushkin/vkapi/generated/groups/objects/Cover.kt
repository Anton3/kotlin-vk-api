package name.alatushkin.vkapi.generated.groups.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt
import name.alatushkin.vkapi.generated.common.objects.Image

data class Cover(
    val enabled: BoolInt,
    val images: List<Image>? = null
)
