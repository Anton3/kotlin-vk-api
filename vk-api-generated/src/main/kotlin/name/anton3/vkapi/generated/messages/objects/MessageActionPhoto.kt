@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * No description
 *
 * @property photo100 URL of the preview image with 100px in width
 * @property photo200 URL of the preview image with 200px in width
 * @property photo50 URL of the preview image with 50px in width
 */
data class MessageActionPhoto(
    @get:JsonProperty("photo_100") val photo100: String,
    @get:JsonProperty("photo_200") val photo200: String,
    @get:JsonProperty("photo_50") val photo50: String
)
