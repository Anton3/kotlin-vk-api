@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property count Total number
 * @property items No description
 * @property more No description
 */
data class GetAllResponse(
    val count: Int? = null,
    val items: List<PhotoXtrRealOffset>? = null,
    val more: BoolInt? = null
)
