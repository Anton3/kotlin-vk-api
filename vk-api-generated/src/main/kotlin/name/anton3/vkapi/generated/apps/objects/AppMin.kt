@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.apps.objects

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize

/**
 * No description
 *
 * @property type No description
 * @property id Application ID
 * @property title Application title
 * @property authorId Application author's ID
 * @property icon139 URL of the app icon with 139 px in width
 * @property icon150 URL of the app icon with 150 px in width
 * @property icon278 URL of the app icon with 278 px in width
 * @property icon75 URL of the app icon with 75 px in width
 */
@JsonDeserialize(`as` = AppMinImpl::class)
interface AppMin {
    val type: AppType
    val id: Int
    val title: String
    val authorId: Int?
    @get:JsonProperty("icon_139") val icon139: String?
    @get:JsonProperty("icon_150") val icon150: String?
    @get:JsonProperty("icon_278") val icon278: String?
    @get:JsonProperty("icon_75") val icon75: String?
}
