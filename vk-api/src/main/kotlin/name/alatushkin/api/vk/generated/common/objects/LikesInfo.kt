package name.alatushkin.api.vk.generated.common.objects

data class LikesInfo(
    val count: Long,
    val userLikes: Long,
    val canLike: BoolInt,
    val canPublish: BoolInt? = null
)
