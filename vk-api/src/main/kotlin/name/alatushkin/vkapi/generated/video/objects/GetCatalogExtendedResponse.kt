package name.alatushkin.vkapi.generated.video.objects

import name.alatushkin.vkapi.generated.groups.objects.GroupFull
import name.alatushkin.vkapi.generated.users.objects.UserFull

data class GetCatalogExtendedResponse(
    val items: List<CatBlock>,
    val profiles: List<UserFull>,
    val groups: List<GroupFull>,
    val next: String
)
