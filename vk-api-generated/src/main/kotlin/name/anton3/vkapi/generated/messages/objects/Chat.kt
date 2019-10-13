@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.messages.objects

import com.fasterxml.jackson.annotation.JsonProperty
import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property adminId Chat creator ID
 * @property id Chat ID
 * @property kicked No description
 * @property left No description
 * @property photo100 URL of the preview image with 100 px in width
 * @property photo200 URL of the preview image with 200 px in width
 * @property photo50 URL of the preview image with 50 px in width
 * @property pushSettings No description
 * @property title Chat title
 * @property type Chat type
 * @property users No description
 */
data class Chat(
    val adminId: Int,
    val id: Int,
    val kicked: BoolInt? = null,
    val left: BoolInt? = null,
    @get:JsonProperty("photo_100") val photo100: String? = null,
    @get:JsonProperty("photo_200") val photo200: String? = null,
    @get:JsonProperty("photo_50") val photo50: String? = null,
    val pushSettings: ChatPushSettings? = null,
    val title: String? = null,
    val type: String,
    val users: List<Int>
)
