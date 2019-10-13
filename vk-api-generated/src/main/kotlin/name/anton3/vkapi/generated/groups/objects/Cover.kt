@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.generated.common.objects.Image
import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property enabled No description
 * @property images No description
 */
data class Cover(
    val enabled: BoolInt,
    val images: List<Image>? = null
)
