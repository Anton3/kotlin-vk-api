package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.generated.common.objects.Image

/**
 * No description
 *
 * @property enabled Information whether cover is enabled
 * @property images No description
 */
data class Cover(
    val enabled: Boolean,
    val images: List<Image>? = null
)
