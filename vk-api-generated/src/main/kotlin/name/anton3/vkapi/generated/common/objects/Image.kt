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
@JsonDeserialize(`as` = ImageImpl::class)
interface Image {
    val height: Int
    val url: String
    val width: Int
}
