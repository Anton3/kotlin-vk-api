package name.alatushkin.api.vk.generated.ads.objects

import name.alatushkin.api.vk.generated.common.objects.ObjectWithName

data class Category(
    val id: Long,
    val name: String,
    val subcategories: List<ObjectWithName>? = null
)
