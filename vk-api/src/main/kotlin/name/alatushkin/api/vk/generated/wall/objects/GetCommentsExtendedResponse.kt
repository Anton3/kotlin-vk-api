package name.alatushkin.api.vk.generated.wall.objects

import name.alatushkin.api.vk.generated.groups.objects.Group
import name.alatushkin.api.vk.generated.users.objects.User

data class GetCommentsExtendedResponse(
    val count: Long,
    val items: List<WallComment>,
    val profiles: List<User>,
    val groups: List<Group>
)
