package name.alatushkin.api.vk.generated.groups.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt
import name.alatushkin.api.vk.generated.common.objects.Image

data class Cover(
    val enabled: BoolInt,
    val images: List<Image>? = null
)
