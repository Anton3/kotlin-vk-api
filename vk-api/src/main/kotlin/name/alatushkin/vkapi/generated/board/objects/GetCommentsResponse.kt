package name.alatushkin.vkapi.generated.board.objects

data class GetCommentsResponse(
    val count: Long,
    val items: List<TopicComment>,
    val poll: TopicPoll? = null
)
