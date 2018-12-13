package name.alatushkin.vkapi.generated.wall.objects

import name.alatushkin.vkapi.generated.groups.objects.Group
import name.alatushkin.vkapi.generated.users.objects.User

data class GetCommentsExtendedResponse(
    val count: Long,
    val items: List<WallComment>,
    val profiles: List<User>,
    val groups: List<Group>
)
