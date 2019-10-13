@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * conversation cover image
 *
 * @property photo50 URL of conversation image with width size of 50 px
 * @property photo100 URL of conversation image with width size of 100 px
 * @property photo200 URL of conversation image with width size of 200 px
 */
data class ConversationChatSettingsPhoto(
    @get:JsonProperty("photo_50") val photo50: String,
    @get:JsonProperty("photo_100") val photo100: String,
    @get:JsonProperty("photo_200") val photo200: String
)
