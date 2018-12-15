package name.alatushkin.vkapi.generated.video.objects

import name.alatushkin.vkapi.generated.groups.objects.GroupFull
import name.alatushkin.vkapi.generated.users.objects.UserFull

/**
 * No description
 *
 * @property items No description
 * @property profiles No description
 * @property groups No description
 * @property next New value for _from_ parameter
 */
data class GetCatalogExtendedResponse(
    val items: List<CatBlock>,
    val profiles: List<UserFull>,
    val groups: List<GroupFull>,
    val next: String
)
