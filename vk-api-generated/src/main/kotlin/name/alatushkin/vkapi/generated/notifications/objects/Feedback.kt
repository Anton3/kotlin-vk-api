package name.alatushkin.vkapi.generated.notifications.objects

import name.alatushkin.vkapi.generated.common.objects.Geo
import name.alatushkin.vkapi.generated.common.objects.LikesInfo
import name.alatushkin.vkapi.generated.wall.objects.WallpostAttachment

/**
 * No description
 *
 * @property id Item ID
 * @property toId Wall owner's ID
 * @property fromId Reply author's ID
 * @property text Reply text
 * @property likes No description
 * @property attachments No description
 * @property geo No description
 */
data class Feedback(
    val id: Long? = null,
    val toId: Long? = null,
    val fromId: Long? = null,
    val text: String? = null,
    val likes: LikesInfo? = null,
    val attachments: List<WallpostAttachment>? = null,
    val geo: Geo? = null
)
