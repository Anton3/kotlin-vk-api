@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.widgets.objects

import name.anton3.vkapi.generated.common.objects.ObjectCount
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property comments No description
 * @property date Date when widgets on the page has been initialized firstly in Unixtime
 * @property description Page description
 * @property id Page ID
 * @property likes No description
 * @property pageId page_id parameter value
 * @property photo URL of the preview image
 * @property title Page title
 * @property url Page absolute URL
 */
data class WidgetPage(
    val comments: ObjectCount? = null,
    val date: VkDate? = null,
    val description: String? = null,
    val id: Int? = null,
    val likes: ObjectCount? = null,
    val pageId: String? = null,
    val photo: String? = null,
    val title: String? = null,
    val url: String? = null
)
