package name.alatushkin.api.vk.generated.video.objects

import name.alatushkin.api.vk.generated.groups.objects.GroupFull
import name.alatushkin.api.vk.generated.users.objects.UserFull

data class GetCatalogSectionExtendedResponse(
    val items: List<CatElement>,
    val profiles: List<UserFull>,
    val groups: List<GroupFull>,
    val next: String
)
