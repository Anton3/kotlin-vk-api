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
@JsonDeserialize(`as` = Void::class)
data class AppMinImpl(
    override val type: AppType,
    override val id: Int,
    override val title: String,
    override val authorId: Int? = null,
    @get:JsonProperty("icon_139") override val icon139: String? = null,
    @get:JsonProperty("icon_150") override val icon150: String? = null,
    @get:JsonProperty("icon_278") override val icon278: String? = null,
    @get:JsonProperty("icon_75") override val icon75: String? = null
) : AppMin
