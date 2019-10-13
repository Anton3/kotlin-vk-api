@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.notifications.objects

import name.anton3.vkapi.generated.common.objects.Geo
import name.anton3.vkapi.generated.common.objects.LikesInfo
import name.anton3.vkapi.generated.wall.objects.WallpostAttachment

/**
 * No description
 *
 * @property attachments No description
 * @property fromId Reply author's ID
 * @property geo No description
 * @property id Item ID
 * @property likes No description
 * @property text Reply text
 * @property toId Wall owner's ID
 */
data class Feedback(
    val attachments: List<WallpostAttachment>? = null,
    val fromId: Int? = null,
    val geo: Geo? = null,
    val id: Int? = null,
    val likes: LikesInfo? = null,
    val text: String? = null,
    val toId: Int? = null
)
