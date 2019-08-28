@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.common.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property userLikes Information whether current user likes the photo
 * @property count Likes number
 */
data class Likes(
    val userLikes: BoolInt? = null,
    val count: Int? = null
)
