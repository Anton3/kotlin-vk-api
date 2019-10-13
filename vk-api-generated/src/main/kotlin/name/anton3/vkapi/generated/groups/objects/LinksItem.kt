@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import com.fasterxml.jackson.annotation.JsonProperty
import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property desc Link description
 * @property editTitle No description
 * @property id Link ID
 * @property name Link title
 * @property photo100 URL of square image of the link with 100 pixels in width
 * @property photo50 URL of square image of the link with 50 pixels in width
 * @property url Link URL
 */
data class LinksItem(
    val desc: String? = null,
    val editTitle: BoolInt? = null,
    val id: Int? = null,
    val name: String? = null,
    @get:JsonProperty("photo_100") val photo100: String? = null,
    @get:JsonProperty("photo_50") val photo50: String? = null,
    val url: String? = null
)
