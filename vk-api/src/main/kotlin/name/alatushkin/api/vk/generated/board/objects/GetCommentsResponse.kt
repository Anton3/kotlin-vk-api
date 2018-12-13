package name.alatushkin.api.vk.generated.board.objects

data class GetCommentsResponse(
    val count: Long,
    val items: List<TopicComment>,
    val poll: TopicPoll? = null
)
