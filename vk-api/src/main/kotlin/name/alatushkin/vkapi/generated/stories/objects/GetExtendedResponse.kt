package name.alatushkin.vkapi.generated.stories.objects

import name.alatushkin.vkapi.generated.groups.objects.Group
import name.alatushkin.vkapi.generated.users.objects.User

data class GetExtendedResponse(
    val count: Long,
    val items: List<List<Story>>,
    val profiles: List<User>,
    val groups: List<Group>
)
