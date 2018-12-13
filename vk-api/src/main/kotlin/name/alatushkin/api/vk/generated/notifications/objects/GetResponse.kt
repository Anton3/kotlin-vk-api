package name.alatushkin.api.vk.generated.notifications.objects

import name.alatushkin.api.vk.generated.groups.objects.Group
import name.alatushkin.api.vk.generated.users.objects.User

data class GetResponse(
    val count: Long? = null,
    val items: List<Notification>? = null,
    val profiles: List<User>? = null,
    val groups: List<Group>? = null,
    val lastViewed: Long? = null
)
