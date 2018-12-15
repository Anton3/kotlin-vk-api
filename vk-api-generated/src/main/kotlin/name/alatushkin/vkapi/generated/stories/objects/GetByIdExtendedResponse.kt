package name.alatushkin.vkapi.generated.stories.objects

import name.alatushkin.vkapi.generated.groups.objects.GroupFull
import name.alatushkin.vkapi.generated.users.objects.UserFull

/**
 * No description
 *
 * @property count Stories count
 * @property items No description
 * @property profiles No description
 * @property groups No description
 */
data class GetByIdExtendedResponse(
    val count: Long,
    val items: List<Story>,
    val profiles: List<UserFull>,
    val groups: List<GroupFull>
)
