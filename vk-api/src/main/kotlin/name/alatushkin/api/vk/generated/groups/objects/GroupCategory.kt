package name.alatushkin.api.vk.generated.groups.objects

import name.alatushkin.api.vk.generated.common.objects.ObjectWithName

data class GroupCategory(
    val id: Long,
    val name: String,
    val subcategories: List<ObjectWithName>? = null
)
