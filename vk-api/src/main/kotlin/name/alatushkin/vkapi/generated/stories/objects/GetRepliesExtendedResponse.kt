package name.alatushkin.vkapi.generated.stories.objects

import name.alatushkin.vkapi.generated.groups.objects.GroupFull
import name.alatushkin.vkapi.generated.users.objects.UserFull

data class GetRepliesExtendedResponse(
    val count: Long,
    val items: List<List<Story>>,
    val profiles: List<UserFull>,
    val groups: List<GroupFull>
)
