package name.alatushkin.vkapi.generated.groups.objects

import name.alatushkin.vkapi.generated.common.objects.ObjectWithName

data class GroupCategory(
    val id: Long,
    val name: String,
    val subcategories: List<ObjectWithName>? = null
)
