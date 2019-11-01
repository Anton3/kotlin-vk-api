@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.photos.objects

import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property count Total number
 * @property items No description
 * @property more Information whether next page is presented
 */
data class GetAllExtendedResponse(
    val count: Int? = null,
    val items: List<PhotoFullXtrRealOffset>? = null,
    val more: BoolInt? = null
)
