package name.alatushkin.vkapi.generated.ads.objects

import name.alatushkin.vkapi.generated.common.objects.ObjectWithName

data class Category(
    val id: Long,
    val name: String,
    val subcategories: List<ObjectWithName>? = null
)
