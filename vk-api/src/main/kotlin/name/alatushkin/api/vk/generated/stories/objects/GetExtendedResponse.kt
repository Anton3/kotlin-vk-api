package name.alatushkin.api.vk.generated.stories.objects

import name.alatushkin.api.vk.generated.groups.objects.Group
import name.alatushkin.api.vk.generated.users.objects.User

data class GetExtendedResponse(
    val count: Long,
    val items: List<List<Story>>,
    val profiles: List<User>,
    val groups: List<Group>
)
