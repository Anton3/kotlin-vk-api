package name.alatushkin.vkapi.generated.board.objects

import name.alatushkin.vkapi.generated.groups.objects.Group
import name.alatushkin.vkapi.generated.users.objects.User

data class GetCommentsExtendedResponse(
    val count: Long,
    val items: List<TopicComment>,
    val poll: TopicPoll? = null,
    val profiles: List<User>,
    val groups: List<Group>
)
