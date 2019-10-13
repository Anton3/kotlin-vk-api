@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.video.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.common.objects.Image
import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property withPadding No description
 * @property height Image height
 * @property url Image url
 * @property width Image width
 */
@JsonDeserialize(`as` = Void::class)
data class VideoImage(
    val withPadding: BoolInt? = null,
    override val height: Int,
    override val url: String,
    override val width: Int
) : Image
