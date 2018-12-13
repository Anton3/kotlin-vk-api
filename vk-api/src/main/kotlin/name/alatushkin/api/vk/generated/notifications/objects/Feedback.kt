package name.alatushkin.api.vk.generated.notifications.objects

import name.alatushkin.api.vk.generated.common.objects.Geo
import name.alatushkin.api.vk.generated.common.objects.LikesInfo
import name.alatushkin.api.vk.generated.wall.objects.WallpostAttachment

data class Feedback(
    val id: Long? = null,
    val toId: Long? = null,
    val fromId: Long? = null,
    val text: String? = null,
    val likes: LikesInfo? = null,
    val attachments: List<WallpostAttachment>? = null,
    val geo: Geo? = null
)
