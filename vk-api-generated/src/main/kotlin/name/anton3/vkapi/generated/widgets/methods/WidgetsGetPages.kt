@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.widgets.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.widgets.objects.GetPagesResponse
import name.anton3.vkapi.method.UserServiceMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/widgets.getPages]
 *
 * Gets a list of application/site pages where the [vk.com/dev/Comments|Comments widget] or [vk.com/dev/Like|Like widget] is installed.
 *
 * @property widgetApiId No description
 * @property order No description
 * @property period No description
 * @property offset No description
 * @property count No description
 */
data class WidgetsGetPages(
    var widgetApiId: Int? = null,
    var order: String? = null,
    var period: String? = null,
    var offset: Int? = null,
    var count: Int? = null
) : VkMethod<GetPagesResponse, UserServiceMethod>("widgets.getPages", jacksonTypeRef())
