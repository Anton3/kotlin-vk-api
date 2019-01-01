package name.anton3.vkapi.generated.stories.objects

import name.anton3.vkapi.generated.groups.objects.Group
import name.anton3.vkapi.generated.users.objects.User

/**
 * No description
 *
 * @property count Stories count
 * @property items No description
 * @property profiles No description
 * @property groups No description
 */
data class GetExtendedResponse(
    val count: Int,
    val items: List<List<Story>>,
    val profiles: List<User>,
    val groups: List<Group>
)
