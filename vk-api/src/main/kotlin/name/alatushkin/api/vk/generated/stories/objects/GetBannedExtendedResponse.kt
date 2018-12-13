package name.alatushkin.api.vk.generated.stories.objects

import name.alatushkin.api.vk.generated.groups.objects.GroupFull
import name.alatushkin.api.vk.generated.users.objects.UserFull

data class GetBannedExtendedResponse(
    val count: Long,
    val items: List<Long>,
    val profiles: List<UserFull>,
    val groups: List<GroupFull>
)
