package name.alatushkin.vkapi.generated.stories.objects

import name.alatushkin.vkapi.generated.groups.objects.Group
import name.alatushkin.vkapi.generated.users.objects.User

/**
 * No description
 *
 * @property count Stories count
 * @property items No description
 * @property profiles No description
 * @property groups No description
 */
data class GetExtendedResponse(
    val count: Long,
    val items: List<List<Story>>,
    val profiles: List<User>,
    val groups: List<Group>
)
