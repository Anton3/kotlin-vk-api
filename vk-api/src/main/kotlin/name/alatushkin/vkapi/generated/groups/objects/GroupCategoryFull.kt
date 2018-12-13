package name.alatushkin.vkapi.generated.groups.objects

data class GroupCategoryFull(
    val id: Long,
    val name: String,
    val subcategories: List<GroupCategory>? = null,
    val pageCount: Long,
    val pagePreviews: List<Group>
)
