package name.alatushkin.vkapi.generated.stories.objects

import name.alatushkin.vkapi.generated.groups.objects.GroupFull
import name.alatushkin.vkapi.generated.users.objects.UserFull

data class GetBannedExtendedResponse(
    val count: Long,
    val items: List<Long>,
    val profiles: List<UserFull>,
    val groups: List<GroupFull>
)
