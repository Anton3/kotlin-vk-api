@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.common.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property count Likes number
 * @property userLikes Information whether current user likes the photo
 */
data class Likes(
    val count: Int? = null,
    val userLikes: BoolInt? = null
)
