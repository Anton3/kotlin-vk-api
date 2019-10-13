@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.likes.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property liked No description
 * @property copied No description
 */
data class IsLikedResponse(
    val liked: BoolInt,
    val copied: BoolInt
)
