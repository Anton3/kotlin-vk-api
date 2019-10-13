@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.common.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize

/**
 * No description
 *
 * @property height Image height
 * @property url Image url
 * @property width Image width
 */
@JsonDeserialize(`as` = Void::class)
data class ImageImpl(
    override val height: Int,
    override val url: String,
    override val width: Int
) : Image
