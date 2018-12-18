@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.widgets.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.widgets.objects.GetPagesResponse
import name.anton3.vkapi.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/widgets.getPages]
 *
 * Gets a list of application/site pages where the [vk.com/dev/Comments|Comments widget] or [vk.com/dev/Like|Like widget] is installed.
 *
 * @property widgetApiId No description
 * @property order No description
 * @property period No description
 * @property count No description
 */
data class WidgetsGetPages(
    var widgetApiId: Long? = null,
    var order: String? = null,
    var period: String? = null,
    var count: Long? = null
) : VkMethod<GetPagesResponse>("widgets.getPages", jacksonTypeRef()),
    UserServiceMethod
