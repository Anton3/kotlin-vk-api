package name.alatushkin.vkapi.generated.widgets.objects

import name.alatushkin.vkapi.generated.common.objects.ObjectCount
import name.alatushkin.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property id Page ID
 * @property title Page title
 * @property description Page description
 * @property photo URL of the preview image
 * @property url Page absolute URL
 * @property likes No description
 * @property comments No description
 * @property date Date when widgets on the page has been initialized firstly in Unixtime
 * @property pageId page_id parameter value
 */
data class WidgetPage(
    val id: Long? = null,
    val title: String? = null,
    val description: String? = null,
    val photo: String? = null,
    val url: String? = null,
    val likes: ObjectCount? = null,
    val comments: ObjectCount? = null,
    val date: VkDate? = null,
    val pageId: String? = null
)
