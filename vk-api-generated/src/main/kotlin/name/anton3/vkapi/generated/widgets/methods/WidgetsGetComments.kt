@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.widgets.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.widgets.objects.GetCommentsResponse
import name.anton3.vkapi.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/widgets.getComments]
 *
 * Gets a list of comments for the page added through the [vk.com/dev/Comments|Comments widget].
 *
 * @property widgetApiId No description
 * @property url No description
 * @property pageId No description
 * @property order No description
 * @property fields No description
 * @property count No description
 */
data class WidgetsGetComments(
    var widgetApiId: Long? = null,
    var url: String? = null,
    var pageId: String? = null,
    var order: String? = null,
    var fields: List<String>? = null,
    var count: Long? = null
) : VkMethod<GetCommentsResponse>("widgets.getComments", jacksonTypeRef()),
    UserServiceMethod
