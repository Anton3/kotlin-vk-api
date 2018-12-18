package name.anton3.vkapi.generated.video.objects

import name.anton3.vkapi.generated.groups.objects.GroupFull
import name.anton3.vkapi.generated.users.objects.UserFull

/**
 * No description
 *
 * @property items No description
 * @property profiles No description
 * @property groups No description
 * @property next New value for _from_ parameter
 */
data class GetCatalogSectionExtendedResponse(
    val items: List<CatElement>,
    val profiles: List<UserFull>,
    val groups: List<GroupFull>,
    val next: String
)
